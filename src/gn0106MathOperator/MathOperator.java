/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "MathOperator"
 * MathOperator.java �u��{�I�ȎZ�p���Z�q�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac MathOperator.java
 *     >java MathOperator
 * �y�L�[���[�h�z
 *     ���Z�q(Operator), java.util.Formatter�N���X, 
 * �y�����Ă݂悤�z
 *     ����Z�̌��ʂ������_�܂ŋ��߂�B *     �}�C�i�X�̒l�Ŋ������]������߂Ă݂�B
 */
package gn0106MathOperator;
import java.lang.String;
import java.lang.System;

public class MathOperator {
    public static void main(String[] A00) {
        int L00 = 25;
        int L01 = 6;
        double L02 = 2.56;

        System.out.printf("�����Z�F%d + %d = %d%n", L00, L01, L00 + L01);
        System.out.printf("�����Z�F%d - %d = %d%n", L00, L01, L00 - L01);
        System.out.printf("�|���Z�F%d * %d = %d%n", L00, L01, L00 * L01);
        System.out.printf("����Z�F%d / %d = %d%n", L00, L01, L00 / L01);
        System.out.printf("��]�Z�F%d %% %d = %d%n", L00, L01, L00 % L01);
        System.out.printf("��]�Z�F%d %% %.2f = %.2f%n", L00, L02, L00 % L02);        
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Java�݂̂Ȃ炸�A�����̃v���O��������̎Z�p���Z�q�́A��ʓI�Ȑ��w�Ƃ�
������ƈ�����L�����g���܂��B

�|���Z�́u*�v�B�A���t�@�x�b�g�́uX�v�Ƌ�ʂ��邽�߂ł��ˁB����Z��
�u/�v�B�������m�̊���Z�̌��ʂ͐����i�����_�ȉ��؎̂āj�ƂȂ�̂��|�C��
�g�ł��B�u%�v�͏�]�Z�ƌĂ΂�A�������]������߂���̂ł��B�S�����̃p�[
�Z���g�Ƃ͊֌W����܂���B���̏�]�Z�͐��������ł͂Ȃ��A�����ł��g�p��
�\�B���ۂɎg���ǖʂ͏��Ȃ��Ǝv���܂����A�ꉞ�������Ă����Ă��������B

���Ȃ݂ɁAprintf�̒��ł�"%"��������\���L���Ɏg���܂��̂ŁA"%%"�ƋL�q
���Ă܂��B���ʂ�println�ŕ\������ꍇ�ƈႢ�܂��̂ŁA�����ӂ��B
 */
