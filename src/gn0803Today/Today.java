/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Today"
 * Today.java �u�����̓��t��\������v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Today.java
 *     >java Today
 * �y�L�[���[�h�z
 *     java.util.Date�N���X, java.util.Formatter�N���X, fromat(����������), *     �t�@�N�g��(factory)���\�b�h
 * �y�����Ă݂悤�z
 *     ���ꂼ��̎�@�ŁA�N�⎞�Ԃ��\������B *     
 */
import java.lang.String;
import java.lang.System;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Today {
    public static void main(String[] A00) {
        Calendar L00 = Calendar.getInstance();

        // ���t�j��������擾
        String[] L01 = {"��", "��", "��", "��", "��", "��", "�y"};
        int L02 = L00.get(Calendar.MONTH) + 1;
        int L03 =  L00.get(Calendar.DAY_OF_MONTH);
        int L04 =  L00.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.printf("������%02d��%02d��%s�j���ł��B%n", L02, L03, L01[L04]);

        // DateFormat�𗘗p
        SimpleDateFormat L05 = new SimpleDateFormat("MM��dd��E�j��");
        System.out.printf("������%s�ł��B%n", L05.format(L00.getTime()));

        // ��̃J�����_�[�I�u�W�F�N�g����擾
        System.out.printf("������%1$tm��%1$td��%1$tA�ł��B%n", L00);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�l���ꂼ��A�ǂ����Ă��o�����Ȃ����Ƃ��Ă���Ǝv����ł����A�l�̏ꍇ�A
Java�œ��t��\��������@�������ɖY��Ă��܂��܂��B�Q�l���̓����������J��
�ẮA�u�O�����������ȁv�Ɩ���Ԃ₢�Ă鎟��B

Calendar������t�����o�����@�ƁASimpleDateFormat�ŏ�����������@������
��ł����A���̂ǂ�������A�����ɍ����������ȗv�f���܂�ł��ł���ˁB��
��0����n�܂�̂ɁA�j����1���炾������A�萔�t�B�[���h���A�p�^�[������
�񂪂����ς���������c�c�B

����Ȗl�̋C������m���Ă��m�炸���AJ2SE5.0����́ACalendar��printf��
�t�H�[�}�b�g����Ƃ����A�V���ȕ��@�������܂����B�����A�S���o����̖�
���B������߂܂��B

���̃T���v���ł͂��̂R�̕��@�œ����\�����������Ă��܂��B�P���ɏo�͂���
�Ƃ���printf�A������Ƃ��Đ��`����Ƃ���SimpleDateFormat���AC����ł���
sprintf�ɂ�����String.format���\�b�h�A���t�𐔒l�Ƃ��Ĉ��������Ƃ���
Calendar�Ƃ����g�������ɂȂ�ł��傤�ˁB
 */
