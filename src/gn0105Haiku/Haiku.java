/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Haiku"
 * Haiku.java �u�����Z�Ƃ��Ă�"+"�ƁA������A�����Z�q�Ƃ��Ă�"+"�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Haiku.java
 *     >java Haiku
 * �y�L�[���[�h�z
 *     ���Z(add)���Z�q, ������A��(string concatenation)���Z�q, ���̕]������
 * �y�����Ă݂悤�z
 *     (L03 + L04 + L03)�ł͂Ȃ��A(L03 + L04 + L03 + "���ō\������܂��B")�Ƃ�����A *     �ǂ��\������邩�\�z���āA�����Ă݂�B
 */
package gn0105Haiku;
import java.lang.String;
import java.lang.System;

public class Haiku {
    public static void main(String[] A00) {
        String L00 = "�Òr��";
        String L01 = "�^��э���";
        String L02 = "���̉�";

        System.out.println("�`" + L00 + L01 + L02 + "�`");

        int L03 = 5;
        int L04 = 7;

        System.out.println("�o���" + L03 + L04 + L03 + "��" +
                (L03 + L04 + L03) + "���ō\������܂��B");    
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���Z�q"+"�́A���̍��E�̒l�������Ƃ����l�̏ꍇ�ɂ͑����Z���s���A�ǂ��炩
��������̏ꍇ�́A������ƂȂ����킹���ڂ����܂��B�o�͌��ʂƌ����
�āA()�Ő��l���m���Ɍv�Z�����������́u17�v�ɂȂ��āA������Ƒ������킹
�������́u575�v�ƂȂ��Ă邱�Ƃ��m�F���Ă��������B

���̃T���v���͎����ł����C�ɓ���ŁA�m�Ԃ̋�ɂ͋y�΂��Ƃ��A�Ȃ��Ȃ��ɐ[
����̂���o���h�����Ǝ������Ă���܂��B
 */
