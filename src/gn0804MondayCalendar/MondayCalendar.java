/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "MondayCalendar"
 * MondayCalendar.java �u���j������n�܂�J�����_�[���쐬�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac MondayCalendar.java
 *     >java MondayCalendar
 * �y�L�[���[�h�z
 *     Static�C���|�[�g, java.util.Formatter�N���X, 
 * �y�����Ă݂悤�z
 *     ���j�ȊO�̗j������n�܂�悤�ɂ���B
 */
import java.lang.String;
import java.lang.System;
import java.util.Calendar;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONDAY;

public class MondayCalendar {
    public static void main(String[] A00) {
        Calendar L00 = Calendar.getInstance();
        int L01 = L00.get(YEAR);
        int L02 = L00.get(MONTH);
        L00.set(L01, L02, 1);
        int L03 = L00.getActualMaximum(DAY_OF_MONTH);
        int L04 = L00.get(DAY_OF_WEEK);

        System.out.printf("�@�` %d�N%2d�� �`�@%n", L01, L02 + 1);
        System.out.println("�� �� �� �� �� �y ��");

        // �󔒂̌������߂�
        int L06;
        if (L04 < MONDAY) {
            L06 = (L04 + 7) - MONDAY;
        } else {
            L06 = L04 - MONDAY;
        }

        int L05 = 0;

        for (int L07 = 0; L07 < L06; L07++) {
            System.out.print("   ");
            L05++;
        }

        for (int L08 = 1; L08 <= L03; L08++) {
            if (L05 < 6) {
                System.out.printf("%2d ", L08);
            } else {
                System.out.printf("%2d%n", L08);
            }
            L05 = ++L05 % 7;
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�ȑO�A���[���b�p�𗷍s�����Ƃ��ɁA���y�Y�ɃJ�����_�[�𔃂�����ł����A��
�̃J�����_�[�́A���j����n�܂��ē��j�ŏI���j���̔z��ɂȂ��Ă܂����B�m
���Ɂu���j�d���n�߁A�y���͏T���v�Ƃ����̂����ۂ̊��o�ł���ˁB�Ō��ǁA��
�̔z�񂪋C�ɓ����āA�N�ɂ��������Ɏ����Ŏg�����Ƃɂ��܂����B���̃v���O��
���͂��̃J�����_�[���Č����Ă��܂��B

�v���O�������̂͂���قǒ����Ȃ���ł����A�����̃��W�b�N����ǂ���͓̂�
������������܂���B�u���̌���1���̗j������󔒂̌������߂�v�u7����
���o�͂��邲�Ƃɉ��s������v�Ƃ����̂��q���g�ł��B

���̒��ɂ͗l�X�ȏA�ƌ`�Ԃ̐l������Ǝv���̂Łu�����͐��j�����T�̎n�܂�
���I�v���Đl��WednesdayCalendar�ɒ��킵�Ă݂Ă��������B
 */
