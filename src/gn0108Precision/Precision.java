/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Precision"
 * Precision.java �u�����̐��x�����؂���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Precision.java
 *     >java Precision
 * �y�L�[���[�h�z
 *     ����(integer), �P���x(single precision), �{���x(double precision),  *     ���������_(floating point number), 10�i��,(decimal), 2�i��(binary),  *     ���e����(literal)
 * �y�����Ă݂悤�z
 *     int�^�́u�ϐ��v���m���v�Z���āAbouble�^�̌��ʂ����߂�B *     BigDecimal�N���X�𗘗p���āA�덷�𐶂�������0.1��10�񑫂����킹��B
 */
package gn0108Precision;
import java.lang.String;
import java.lang.System;

public class Precision {
    public static void main(String[] A00) {

        System.out.println("���e�����̌v�Z");
        System.out.println("����(int)���Z     �F10  /  3   = " + (10 / 3));
        System.out.println("�P���x(float)���Z �F10F /  3F  = " + (10F / 3F));
        System.out.println("�{���x(double)���Z�F10D  / 3D  = " + (10D / 3D));
        System.out.println("�{���x(double)���Z�F10.0 / 3.0 = " + (10.0 / 3.0));

        System.out.println();

        System.out.println("0.1��10�񑫂����킹�����ʂ�...");

        double L00 = 0.0;
        for (int L01 = 0; L01 < 10; L01++) {
            L00 += 0.1;
        }

        System.out.println("�Ȃ�ƁA1.0����Ȃ��ā@" + L00);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Java�ɂ����鐔���̌v�Z���ʂ́A���Ɋ܂܂��l�̌^�ɂ���ĕω����܂��B����
���m�̌v�Z�Ȃ猋�ʂ������B"15 / 10 = 1.5"�ł͂Ȃ��āA"15 / 10 = 1"�ł���
�ŁA���ԈႦ�Ȃ��悤�B

���Ⴀ�A�������m�����Z���ď����̌��ʂ𓾂����ꍇ�ɂ͂ǂ�����H

�܂��A�^���w�肵�ă��e�������L�q����Ƃ������@������܂��B���e�����Ƃ�
�\�[�X�̒��ɒ��ڏ������܂ꂽ�l�̂��ƁB���l�̖�����F�܂���f�������float
�^�AD�܂���d�������double�^�Ɖ��߂���܂��B�܂��A"15.0"�̂悤�ɂ킴�Ə�
���_������Ƃ������@������܂��B���̏ꍇ�A���l��double�^�Ƃ��ĉ��߂���
�܂��B

�R���s���[�^�̐��E�̏����ɂ́A�u���x�v�Ƃ����T�O������̂��m���Ă����K�v
������܂��B����͂ǂ��܂ŏ����_�ȉ���\�����邩�Ƃ������ƂŁA�t�̌�����
������΁A�����̂��[���Ɩ��[�����͑ł��؂��Ă���Ƃ������ƂɂȂ�܂��B
���s���ʂ����Ă���������΁Afloat��double�̑ł��؂���̈Ⴂ���������
���傤�B

������A�R���s���[�^�̐��E�̏����ŗ��ӂ��ׂ��_�ɁA�u10�i���Ƃ̌덷�v��
����܂��B����10�i���̏�����2�i���ŕ\�����邱�Ƃ͕s�\�ŁA0.1�Ƃ�������
�ł���A����ɍł��߂����������_�ɂ���ĕ\����Ă܂��B10�񑫂��Ă�1.0��
�Ȃ�Ȃ��̂͂��̌덷�̂��߂ł��B

�����������Ƃ́A�m���Ă�΁u����Ȃ��񂩁v�Ǝv���܂����A�m��Ȃ�������A
�uJava�͏��w�����x���̌v�Z���o����̂��I�I�v�Ɠ{�����Ⴂ�����ł���ˁB
BigDecimal���g���Ό덷�̂Ȃ��v�Z���o���܂��̂ŁA�����S���B
 */
