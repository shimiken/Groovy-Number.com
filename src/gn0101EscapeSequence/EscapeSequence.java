package gn0101EscapeSequence;
/*
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "EscapeSequence"
 * EscapeSequence.java �u�G�X�P�[�v�V�[�P���X�ŗV��ł݂�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac EscapeSequence.java
 *     >java EscapeSequence
 * �y�L�[���[�h�z
 *     �G�X�P�[�v�V�[�P���X(escape sequence:�g���\�L), �o�b�N�X���b�V��
 * �y�����Ă݂悤�z
 *     �\�[�X���̕�����ƁA���ۂɏo�͂��ꂽ��������r����B *     �����ŃG�X�P�[�v�V�[�P���X���܂ޕ��͂��l���āA�\������B
 */
import java.lang.String;
import java.lang.System;

public class EscapeSequence {
    public static void main(String[] A00) {
        String L00 = "�����̐V���F\n";
        String L01 = "\t\"���~\b�̉��R\b\b�m�b�N256�{����\"\t�艿 \\1280";

        System.out.println(L00 + L01);

        System.out.println("�u�r�[�v���v���邩���I�H\07");
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�G�X�P�[�v�V�[�P���X�́A�L�[�{�[�h������͂ł��Ȃ�����(���s�A�o�b�N�X
�y�[�X�Ȃ�)��AJava����ɂ����ē��ʂȈӖ������L���i" ' \�Ȃǁj���L�q��
�邽�߂ɗp�ӂ���Ă��܂��B�������̎�ނ�����܂����A�悭�g����̂́A
\" \' \\ \n�ł��̂ŁA���̂S����o���Ă��������B

�T���v���ł̓r�[�v����炵�Ă܂����A����̓R���g���[���R�[�h�Ƃ�������
���o�͂��邱�Ƃɂ���Ď������Ă܂��B���ɂ���Ă͉����o�Ȃ���������܂�
�񂵁A���p�����Ⴂ�̂ŁA�u����Ȃ��Ƃ��ł���񂾁v���x�Ɋo���Ă����Ă���
�����B
 */
