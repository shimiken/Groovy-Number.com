/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "NewYear"
 * NewYear.java �u�����܂ł̓��ɂ������߂�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac NewYear.java
 *     >java NewYear
 * �y�L�[���[�h�z
 *     �J�����_�[�t�B�[���h(calendar fields), ����������(format string), *     java.util.Formatter�N���X, 
 * �y�����Ă݂悤�z
 *     ���̒a�����܂ŉ��������߂�B
 */
import java.lang.String;
import java.lang.System;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_YEAR;

public class NewYear {
    public static void main(String[] A00) {
        Calendar L00 = Calendar.getInstance();
        int L01 = L00.get(DAY_OF_YEAR);
        int L02 = L00.getActualMaximum(DAY_OF_YEAR);
        
        System.out.printf("����%d��Q��ƁA�������B%n", L02 - L01 + 1);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
java.util�p�b�P�[�W�ɂ́ADate�N���X�ACalendar�N���X�Ƃ����A�����悤�Ȋ�
���̃N���X�����݂��܂��B�P���ɃG�|�b�N�^�C���i1970�N1��1��00:00:00�����
�o�ߎ��ԁj�������Ƃ���Date�A���t�������Ƃ���Calendar�Ƃ����̂���ʓI�Ȏg
�������ł��B

�����ŁA�s�v�c�Ȃ̂��u�Ȃ�Date�N���X�œ��t���������Ȃ��̂��H�v�Ƃ�������
�ł���ˁB���́AJDK1.0�̂Ƃ���Date�œ��t�̏������s���Ă܂����B�������A
1.1��Calendar���o�ꂵ�Ĉȍ~�́A�u�N���������b�v�͂���Calendar�̒S����
�Ȃ��āADate�Ɏc���ꂽ�d���́u�~���b�v�݂̂ɂȂ��Ă��܂��܂����BAPI���h
�L�������g�����Ă݂�ƁA�����̃��\�b�h���񐄏��ɂȂ��Ă���̂�������Ǝv
���܂��B

�������������ADate�N���X�́u���t�v�Ɩ����Ȃ���u���t�v���������邱
�Ƃ�������Ȃ��A�߂������݂ɂȂ��Ă܂��B�����Ɏg���Ă��炦�Ȃ��x�e������
���I��݂����ŁA�v�킸������Ⴂ�����ł����A�ł��܂��A�g���Ȃ������
����[�Ȃ���ŁA���̃T���v���ł͂������Calendar�𗘗p���Ă܂��B

���Ȃ݂ɁA�񐄏����\�b�h����������Ƃ����āADate�N���X���̂��񐄏��Ƃ���
�킯���Ⴀ��܂���BDate�^�������ɂƂ郁�\�b�h�͂������񂠂�܂��B
Calender��Date�̕ϊ���Calendar#getTime���\�b�h�ŁADate��Calendar�̕ϊ���
Calendar#setTime���\�b�h�ōs���܂��̂ŁA�o���Ă����Ă��������B

�a�����܂ł̓��������߂�ɂ́A���N�̒a�������߂������ǂ����ŏꍇ��������
�K�v������܂��B���̏������|�C���g�ɂȂ�܂��ˁB
 */
