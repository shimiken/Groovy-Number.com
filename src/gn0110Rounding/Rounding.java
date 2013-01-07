/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Rounding"
 * Rounding.java �uMath��BigDecimal�ɂ�鏬���_�̎l�̌ܓ��A�؂�̂āA�؂�グ�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Rounding.java
 *     >java Rounding
 * �y�L�[���[�h�z
 *     ceil(�؂�グ), floor(�؂艺��), round(�l�̌ܓ�),�@10�i��(decimal), *     �񋓌^(enumerated type),
 * �y�����Ă݂悤�z
 *     BigDecimal�ɗp�ӂ���Ă���8�̊ۂߍ��݃��[�h���`�F�b�N����B *     printf���\�b�h��java.text.NumberFormat�N���X�ŁA�����𐮌`���ĕ\�����Ă݂�B
 */
package gn0110Rounding;
import java.lang.Math;
import java.lang.String;
import java.lang.System;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding {
    public static void main(String[] A00) {

        System.out.println("�����𐮐��ɂ���iMath�N���X�j");

        double L00 = 25.6;
        System.out.println("���̒l�@�F" + L00);
        System.out.println("�؂�グ�F" + (int)Math.ceil(L00));
        System.out.println("�؂�̂āF" + (int)Math.floor(L00));
        System.out.println("�l�̌ܓ��F" + Math.round(L00));

        System.out.println("\n�����_��P�ʂ܂łɂ���iBigDecimal�N���X�j");

        BigDecimal L01 = new BigDecimal("256.256");
        System.out.println("���̒l�@�F" + L01);
        System.out.println("�؂�グ�F" + L01.setScale(1, RoundingMode.CEILING));
        System.out.println("�؂�̂āF" + L01.setScale(1, RoundingMode.FLOOR));
        System.out.println("�l�̌ܓ��F" + L01.setScale(1, RoundingMode.HALF_UP));
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���l�������Ƃ��A�K�v�Ȍ����Ɏ��܂�悤�A�l���u�ۂߍ��݁v�����Ƃ��������
����ˁB����ȂƂ��ɂ悭�g����̂��A�؂�グ�A�؂�̂āA�l�̌ܓ��ł��B

��{�^(int��double�Ȃ�)�ŏ�����i�߂�ꍇ�́AMath�N���X���֗��B�C���X�^
���X�𐶐����邱�ƂȂ��A��y�ɗ��p�ł��܂��B���������x�̖���A������
���ɕϊ�����Ƃ��ɂ����g���ׂ��ł͂���܂���B

BigDecimal�́A�C���X�^���X�̐����������ȂǁA�����ʓ|�ł����A���̂Ԃ�ׂ�
���ۂߍ��ݏ����𐧌䂷�邱�Ƃ��ł��A���x�̖�������܂���B�ꍇ�ɂ����
�g�������Ă��������B

BigDecimal�̊ۂ߃��[�h�̎w��ɂ́A�ȑO�͐����t�B�[���h
�iBigDecimal.ROUND_HALF_UP�Ȃǁj���g���Ă��܂������AJ2SE 5.0����́A
java.math.RoundingMode�̗񋓌^�̎g�p����������Ă��܂��B
 */
