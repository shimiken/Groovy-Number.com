/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "StopWatch"
 * StopWatch.java �u�����ɂ����������Ԃ��v������v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac StopWatch.java
 *     >java StopWatch
 * �y�L�[���[�h�z
 *     ����������(format string), �W������(standard input), *     java.util.Formatter�N���X, 
 * �y�����Ă݂悤�z
 *     ���̃T���v���ŏ����ɂ����������Ԃ��v�����Ă݂�B
 */
import java.io.IOException;
import java.lang.String;
import java.lang.System;

public class StopWatch {

    public static void main(String[] A00) {
        System.out.println("�ޏ��u�����A���Ȃ��Ƃ͕ʂꂽ���́v");
        System.out.println("�����u�����E�E�E�v    <Enter�L�[�������Ă�������>");
        
        long L00 = System.currentTimeMillis();

        try {
            System.in.read();
        } catch (IOException L01) {
        }

        long L02 = System.currentTimeMillis();
        System.out.printf("�l�́A%.3f�b�قǌ��t���������B", (L02 - L00) / 1000.0);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�v���O�����̏������Ԃ��v������ꍇ�ɂ́Ajava.lang.System�N���X��static��
�\�b�h�AcurrentTimeMillis���֗��B���̃��\�b�h�̓V�X�e���̌��݂̎��Ԃ��~
���b�i0.001�b�j�P�ʕԂ��Ă���܂��̂ŁA�J�n�n�_�ƏI���n�_�̍������擾��
��΁A�����ɂ����������Ԃ��v���ł��܂��B

printf�́u%.3f�v�́u�����_��3�ʂ܂ŕ\���v�Ƃ����Ӗ��B���Ƃ�5�b���傤�ǂ�
���u5.000�v�ƕ\�����܂��B

�b�͓ˑR�ς��܂����A���������w���̍��悭�������A���o���ɁA���r���
�wA LONG VACATION�x������܂��B���̃v���O������g��ł�ƁA���̃A���o��
�Ɏ��߂�ꂽ�w������J�����x���v���o���܂����B���̃T���v���Ǝ����V�`��
�G�[�V�����̈�߂������ł���ˁB����ƁA�������������ݏグ�Ă��āA����
���̎������v���o������Ȃ񂩂��āA�������r��𕷂����ɂ͂����Ȃ����
�ɁB����CD������ɒ��s���čw����������ł��B

�ŋ߁A�L����������CM�Ɂw�N�͓V�R�F�x���ASONY�n���f�B�J����CM�Ɂw�X�s�[
�`�E�o���[���x���g���Ă���̂����邽�тɁA�u�����Ɠ����オ������񂾂�
���ȁv�Ǝv�����Ƃ��΂��΂ł��B
 */
