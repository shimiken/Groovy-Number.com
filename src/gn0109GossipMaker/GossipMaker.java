/**
 * 愛のJava256本ノック for Java 5.0
 * Javaサンプルソース ver0.2C "GossipMaker"
 * GossipMaker.java 「配列を引数に取るメソッド」
 *
 * 2005/09/23 制作：安永ノリカズ
 *
 * 【コンパイル＆実行方法】
 *     >javac GossipMaker.java
 *     >java GossipMaker
 * 【キーワード】
 *     配列(array)の初期化(initialize), 配列の長さ(length),  *     乱数(random), 型変換(cast) *     
 * 【試してみよう】
 *     面白いネタが出るまで、何度も実行する。 *     他のテーマで文章を自動生成するプログラムを作る。
 */
package gn0109GossipMaker;
import java.lang.Math;
import java.lang.String;
import java.lang.System;

public class GossipMaker {
    public static void main(String[] A00) {
        String[] L00 = {
            "独占スクープ", "衝撃事実", "極秘情報", "袋とじ",
            "巻頭カラー", "業界騒然", "仰天告白", "感動秘話",
        };
        String[] L01 = {
            "小泉総理", "フセイン元大統領", "うちの部長",
            "ベッカム", "ボブサップ", "プリティ長嶋", 
            "モーニング娘。", "松田聖子", "近所のおばちゃん",
        };
        String[] L02 = {
            "出来ちゃった結婚", "セクハラ現場", "お宝画像流出", "不倫騒動", 
            "吉野家で逆切れ", "カツラ疑惑", "12奪三振完封勝利",
            "ヤンキー暴走族時代",
        };

        System.out.printf("%s!!　%s　%s!?%n", M00(L00), M00(L01), M00(L02));
    }
    
    public static String M00(String[] A00) {
        int L00 = (int)(Math.random() * A00.length);
        return A00[L00];
    }
}

/* ■ クラスの外でちょっと一言 ■
小学生の頃、「いつどこで誰が何をした」ゲームってしませんでした？　「い
つ」「どこで」「誰が」「何をした」というのをそれぞれ紙に書いて、適当につ
なぎ合わせて、その意外性を楽しむってやつです。
このサンプルは、その遊びをヒントに作成しました。人物のところに、身近な人
間を入れると結構楽しめますね。

プログラム的には、配列を引数としてメソッドに渡しているところに注目です。
また、配列の中から無作為に1つの要素を取得する部分では、配列の長さを動的
(プログラム実行時)に取得しているので、データを追加しても、処理ロジックを
変更する必要はありません。
 */
