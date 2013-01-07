/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "LineInput"
 * LineInput.java �u�R�}���h���C�����當������́v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac LineInput.java
 *     >java LineInput
 * �y�L�[���[�h�z
 *     �W������(standard input), �W���o��(standard output),  *     ���o��(io:input/output), �X�g���[��(stream:����),  *     java.io.InputStreamReader
 * �y�����Ă݂悤�z
 *     �A�����ē��͂��󂯕t����B *     ���͂��ꂽ���e���t�@�C���ɏ����o���B
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.String;
import java.lang.System;

public class LineInput {
    public static void main(String[] A00) {
        BufferedReader L00 = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("���������͂��Ă��������F");
            String L01 = L00.readLine();
            System.out.printf("���� = %s%n���� = %d����%n", L01, L01.length());
        } catch(IOException L02) {
            System.out.println("���̓G���[");
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
java.io�p�b�P�[�W�ɂ́A���o�͂̂��߂̃N���X���������񂠂�܂��B�ŏ��́A
�ǂꂪ�ǂ�ȋ@�\�Ȃ̂��A���܂������ł��Ȃ����Ƃł��傤�B���́A���̃p�b
�P�[�W��ǂ݉����ɂ̓R�c�������āA�ŏ���4�̊�b�I�ȃN���X����������K
�v������܂��B

Java�ł͓ǂݏ�������f�[�^�̗�����X�g���[���Ƃ����܂��B���̃X�g���[����
�́A�f�[�^�𐔒l�Ƃ��ď�������u�o�C�g�X�g���[���v�ƁA�����Ƃ��ď�������
�u�����X�g���[���v��2��ނ�����܂��B���̓��͂Əo�͂���b�I��4�̃N���X
�ŕ\����Ă��āA�o�C�g����="InputStream"�A�o�C�g�o��="OutputStream"�A��
������="Reader"�A�����o��="Writer"�ƂȂ��Ă��܂��B

����4�̃N���X�������ł���΁A���Ƃ͊ȒP�B�����̃X�g���[���N���X�́A��
�����p�����Ă��܂��̂ŁA�N���X�������������ŁA��܂��ȋ@�\�������ł���
���B�uDataInputStream�v�́u�f�[�^���o�C�g�œǂݍ��ށv�A�uFileWriter�v��
�u�t�@�C���ɕ����������o���v�Ɖ��߂���΂����ł��B

�܂��A�X�g���[���N���X�̑����́A�R���X�g���N�^�[�ő��̃N���X���󂯎��
�āA�A�����Ďg�p���邱�Ƃ��\�ł��B

����̗�ł����΁ASystem.in�ŕW�����͂Ɏw�肳��Ă���̂�InputStream�B��
�̂܂܂ł́A�o�C�g�f�[�^�����擾�ł��܂���̂ŁA�u�o�C�g�f�[�^�������v��
�ϊ����s��InputStreamReader�ƁA�u������1�s�̕�����v�̕ϊ����s��
BufferedReader���Ȃ����킹�āA�W�����͂���1�s�̕������ǂݍ��ދ@�\��
�������Ă��܂��B

�u�t�@�C���Ƀo�C�g�������o���v�Ƃ��A�uWeb�T�[�o�[����1�s�ǂݍ��ށv�Ƃ��A
�ꍇ�ɂ���Ă��낢��ȓ��o�͂̌`��������Ǝv���܂����A���ׂĂ����̃N��
�X���Ȃ����킹�đΉ����邱�ƂɂȂ�܂��B
 */
