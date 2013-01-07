/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "DecimalSeparator"
 * DecimalSeparator.java �u�قȂ錾����ŁA���l��\������v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac DecimalSeparator.java
 *     >java DecimalSeparator
 * �y�L�[���[�h�z
 *     ���P�[��(locale:�n��), �t�@�N�g��(factory)���\�b�h
 * �y�����Ă݂悤�z
 *     ���̑��̍��̕\���`���𒲂ׂĂ݂�B *     �e�����Ƃ̓��t�̕\���`���𒲂ׂĂ݂�B
 */
import java.lang.String;
import java.lang.System;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalSeparator {
    public static void main(String[] A00) {
        NumberFormat L00;
        int L01 = 2980;
        double L02 = 3.14;

        L00 = NumberFormat.getInstance(Locale.JAPANESE);
        System.out.printf("���{�ł́@ %s �� %s �Ɛ����������܂����A%n",
                L00.format(L01), L00.format(L02));

        L00 = NumberFormat.getInstance(Locale.GERMANY);
        System.out.printf("�h�C�c�ł� %s �� %s �Ə����܂��B%n",
                L00.format(L01), L00.format(L02));
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Java��API�h�L�������g�𒭂߂ĂāA�g�������ƂȂ��N���X��A���߂Č��郁
�\�b�h�ɏo��ƁA������ƃ��N���N���Ď����Ɏg���Ă݂����Ȃ�܂��B����
�āA���Ƃ����p�I�ł͂Ȃ��Ƃ��A�����ɉ����̔���������Ɠ������C���ɂȂ��
���B

�����NumberFormat.getInstance���\�b�h�ł̃��P�[���w��͂܂��ɂ��̃p�^�[
���B���P�[���Ƃ́A����╶���I�n���\�����̂ŁA���t�␔�l��\������ۂ�
�Q�Ƃ���܂��B�ʏ�͉����w�肹���ɁA���̊��̃f�t�H���g�̃��P�[���i�F��
��̏ꍇ�͂����炭���{��j���̗p�����ł����A���̃T���v���̂悤�Ɏw�肷
�邱�Ƃ��\�ł��B

�l�͂��̃��\�b�h�ɏo����āA�����_��.(�s���I�h)�ŕ\�L���Ȃ������A���[
���b�p�𒆐S�ɂ������񂠂邱�Ƃ�m��܂����B���肪�Ƃ�Java�̍��ۉ��B����
���Ƃ�NumberFormat�B
 */
