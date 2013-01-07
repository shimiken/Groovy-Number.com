/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Dice"
 * Dice.java �u�������g���ăT�C�R����\���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Dice.java
 *     >java Dice
 * �y�L�[���[�h�z
 *     Math(���w)�N���X, ����(random), �^�ϊ�(cast),  *     ���Z�q(operator)�̗D�揇��(priority), java.util.Formatter�N���X, 
 * �y�����Ă݂悤�z
 *     �A�����ĉ��x�����s���A���l���΂���Ă��邱�Ƃ��m�F����B *     java.util.Random�N���X�𗘗p���āA�������擾����B
 */
package gn0104Dice;
import java.lang.Math;
import java.lang.String;
import java.lang.System;

public class Dice {
    public static void main(String[] A00) {
        int L00 = (int)(1 + Math.random() * 6);
        System.out.printf("�T�C�R�����낱��... %d ���o�܂����B%n", L00);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Math.random()�́A0�ȏ�1�����̃����_���ȏ���(double�^)��Ԃ��܂��B�ł���
�ŁA���炩�̕��@�Ő����ɕϊ����Ă����Ȃ��ƁA�u�T�C�R�����낱
��...4.688346376357093���o�܂����v�ƂȂ��Ă��܂��܂��B

���̗������Ă̂́A�T���v���v���O������ʔ�������̂ɂ����Ă����̋@�\�ŁA
����256�m�b�N�ł��A�����Ɨ��p�����Ă�����Ă܂��B
 */
