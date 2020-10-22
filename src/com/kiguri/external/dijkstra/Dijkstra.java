package com.kiguri.external.dijkstra;

import java.util.Scanner;

/**
 * ダイクストラ法を書いてみる
 * 参考:
 * https://www.youtube.com/watch?v=X1AsMlJdiok
 */
public class Dijkstra {

    /**
     * 内容:
     * https://nw.tsuda.ac.jp/lec/dijkstra/ の写経をして理解してみるやつです
     *
     * 用語:
     * node(○みたいなもの)をedge(線or辺)で結んだものグラフ
     * エッジ上の数値が「重み」と表現する
     *
     * 処理順:
     * 1. 各Nodeまでの距離を未確定として、とりあえず無限大と入れておく
     * 2. 始点Nodeの距離は0としておく
     * 3. 未確定Nodeの中から、edgeの重みが最も小さいNodeを選ぶ
     * 4. そのedgeの重みを「そのNodeまでの最短距離」として確定！
     * 5. 今まで確定したNodeを経由したedgeの重みを計算
     * 6. 4.で確定したNodeから「隣接している」かつ「未確定である」Nodeを割り出す
     * 7. 6.のNodeに対して、4.で計算したedgeの重みより6.のedgeの重み小さければ上書き！
     * 8. 全ての地点が確定すれば終了、じゃなかったら3に戻る
     *
     * 算出に必要な情報(./data/* のファイルを見てください):
     * Node数 edge数
     * Node始まり Nodeの終わり edgeの重み
     * 出発点 edgeの重みを算出したいNode
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nodeの接続関係マップを作成する
        int nNode = sc.nextInt();
        int[][] map = new int[nNode][nNode];
        for (int i = 0; i < nNode; i++) {
            for (int j = 0; j < nNode; j++) {
                // 行と列がかぶる場所は-1を入れておく
                if (i == j) {
                    map[i][j] = 0;
                } else {
                    map[i][j] = -1;
                }
            }
        }

        // 道路の距離をマップに書き込んでいく
        int nEdge = sc.nextInt();
        for (int i = 0; i < nEdge; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int length = sc.nextInt();

            // 多重代入(右から順に処理)
            // 下記のように書くこともできる
            // 1. map[to][from] = length
            // 2. map[from][to] = map[to][from]
            map[from][to] = map[to][from] = length;
        }

        int begin = sc.nextInt();
        int end = sc.nextInt();

        int[] distance = new int[nNode];
        dijkstra(map, begin, distance);

        if (distance[end] == Integer.MAX_VALUE) {
            System.out.println("no route");
        } else {
            System.out.println("distance=" + distance[end]);
        }
    }

    private static void dijkstra(int[][] map, int begin, int[] distance) {

        // 初期化処理していくで(各Nodeは無限大にしておき、未確定にする)
        int nNode = distance.length;
        // 最短距離が確定したかの判定(tTownで初期化するのは、都市分を各都市で確定か未確定かを判定したいから)
        boolean[] fixed = new boolean[nNode];
        for (int i = 0; i < nNode; i++) {
            // edgeの重みは、とりあえず無限大(Java仕様上)と入れておくんや
            distance[i] = Integer.MAX_VALUE;
            // 最初は全部未確定Nodeやろ？
            fixed[i] = false;
        }

        // 処理開始！！！
        // 始点の距離は0としておく、最初は0がええやろ
        distance[begin] = 0;

        while (true) {

            // まずやるのは、今いるNodeからedgeでつながってる未確定のNodeを対象にするんや！
            // 次に、対象にした未確定Nodeのなかで一番小さいedgeの重みでつながってるNodeを選択や！
            // それが今いる確定済みNodeからの最短距離のNodeになるやろ？
            // 0-Node数の範囲や
            int marked = minDistance(distance, fixed);

            // -1が取得できた場合は全都市確定の証拠やで、お疲れさん。
            if (marked < 0) {
                return;
            }

            // intのmaxて...どこ調べてんねん！今すぐやめや！
            if (distance[marked] == Integer.MAX_VALUE) return;

            // このmarkedってのは、取得してきた今いるNodeから一番エッジの重みが小さい未確定Nodeや
            // この未確定Nodeを確定にする必要があるやろ？
            // まずは確定済みにするで！
            fixed[marked] = true;

            // ほなNodeが確定済みなったから、とりあえずNode分回るで！
            // ループ内では確定済みにしたNodeと今まで経由したNodeのedgeの重み比較して書き換えたりするで
            // 詳細はループ内や！
            for (int i = 0; i < nNode; i++) {

                // 「エッジで直接つながっている」&&「未確定である」ってことやで
                // > 0 で比較してるんは、main関数の最初に0と-1で初期化したやろ？
                // もし隣接してるんやったら-1以外が入ってるはずやで！
                // それとな、未確定の場所に新たに距離を入れてやらなあかんやろ？
                // 入れんかったら無限大のままやで！
                if (map[marked][i] > 0 && !fixed[i]) {

                    // さっき確定済みにしたNodeのedgeの重みと、今まで各Nodeにいくために通ってきたedgeの重みを足し算や！
                    // 「エッジで直接つながっている」&&「未確定である」しかここ通らんから、大丈夫や！
                    int newDistance = distance[marked] + map[marked][i];

                    // 「今まで経由したNodeのedgeの重み」が「未確定の隣接Nodeのedgeの重み」より小さいんやったら、
                    // 「未確定の隣接Nodeのedgeの重み」を「今まで経由したNodeのedgeの重み」に書き換えるんや！
                    // これで正確なNodeのedgeの重みがわかるやで。
                    if (newDistance < distance[i]) {
                        distance[i] = newDistance;
                    }
                }
            }

        }
    }

    private static int minDistance(int[] distance, boolean[] fixed) {

        // 各Nodeを全部回るで！
        // 回るたびNode回るためのindexは増加するで！
        // indexは最大でも与えられたNode数分しか回らんから安心してや！
        // 全部未確定じゃないなら、ここで使用しているindexは未確定の最短ってことになるやろ！
        int index = 0;
        for (; index < fixed.length; index++) {

            // 確定しているNodeが見つかったらやめるで。
            // 回るたびに加算されていくindexは見つかったNodeの箇所を指してるから、
            // +1したら今いるNodeからの隣接してるNode達やで！！
            if (!fixed[index]) {
                break;
            }
        }

        // 全Nodeが確定済みやったら全部調べたことになるわ、お疲れさん。
        if (index == fixed.length) {
            return -1;
        }

        // とりあえずNode分ループするで！
        // ループ内で、条件指定して最短距離求める予知やで！
        // さっきも言ったけど、indexは確定済みのNodeの箇所やから+1すると未確定のはずやで！
        for (int i = index + 1; i < fixed.length; i++) {

            // 隣接Nodeの中で一番小さいedge持ってる探していくで！
            // 隣接Nodeが未確定で、隣接Nodeの重みが今いるNodeの重みより大きいんやったらindexは隣接Nodeの箇所になるで！
            // 未確定の隣接Nodeが来るたびに上書きされるで！安心してや！
            if (!fixed[i] && distance[i] < distance[index]) {
                index = i;
            }
        }

        return index;
    }
}
