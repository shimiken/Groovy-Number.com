/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "NumFormat"
 * NumFormat.java �uNumberFormat���g���āA3����؂�̐��l���v�Z����v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac NumFormat.java
 *     >java NumFormat
 * �y�L�[���[�h�z
 *     �t�@�N�g��(factory)���\�b�h, parse(��͂���), format(����������)
 * �y�����Ă݂悤�z
 *     �����_��}�C�i�X���܂�3����؂�̐��������Z����B
 */
import java.lang.String;
import java.lang.System;
import java.text.NumberFormat;
import java.text.ParseException;

public class NumFormat {
    public static void main(String[] A00) {
        String L00 = "3,776";
        String L01 = "8,848";
        int L02;

        NumberFormat L03 = NumberFormat.getInstance();

        try {
            L02 = L03.parse(L00).intValue() + L03.parse(L01).intValue();
            System.out.printf("%s + %s = %s%n", L00, L01, L03.format(L02));
        } catch (ParseException L04) {
            System.out.println("���������͂ł��܂���ł����B");
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
3���ŋ�؂�ꂽ�����������Ƃ��ɂ́A����NumberFormat�N���X���֗��ł��B�I
�u�W�F�N�g�̎擾�́Anew�Ő��������ɁAgetInstance���\�b�h�ōs���܂��B����
�_�������ӂ��Ă����Ό�͊ȒP�Bparse���\�b�h�ŕ������琔�l�ɕϊ����āA
format���\�b�h�Ő��l���當���ɕϊ����܂��B

�����m��Ȃ��ƁA���������J���}����菜������}��������ƁA�]���ȃR�[�h
�������n���ɂȂ�܂��ˁB�����ł��y�������Ƃ����v�l�́A�v���O���}�[�ɂƂ�
�ďd�v�ȃ����^���e�B�ł��B�F������A�ǂ�ǂ�y���邽�߂̒m����~���Ă���
�����B
 */
