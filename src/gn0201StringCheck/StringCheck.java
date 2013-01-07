/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "StringCheck"
 * StringCheck.java �u���K�\���œ��͕��������p�p�����ǂ����`�F�b�N�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac StringCheck.java
 *     >java StringCheck
 * �y�L�[���[�h�z
 *     ���K�\��(regular expression), java.util.regex.Pattern�N���X, *     �R�}���h���C���p�����[�^, �z��̒���(length)
 * �y�����Ă݂悤�z
 *     �X�֔ԍ���d�b�ԍ��̃`�F�b�N���s���B *     Swing��GUI�œ��̓`�F�b�N���s���B *     
 */
import java.lang.String;
import java.lang.System;

public class StringCheck {
    public static void main(String[] A00) {
        if (A00.length < 1) {
            System.out.println("�g�����F>java StringCheck �`�F�b�N���镶����");
            System.exit(1);
        }
        
        System.out.println("���́F" + A00[0]);
        if (A00[0].matches("[0-9a-zA-Z]+")) {
            System.out.println("�`�F�b�N���ʁF���p�p���݂̂̕�����ł��B");
        } else {
            System.out.println("�`�F�b�N���ʁF���p�p���ȊO�̕������܂܂�܂��B");
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Web�̓o�^�t�H�[���ȂǂŁA�u���͔͂��p�p���ł��肢���܂��v�Ƃ����̂�����
�܂���ˁB���̓��͂��ꂽ�����̃`�F�b�N�ɕ֗��Ȃ̂����K�\���B�����񂪃p
�^�[���Ƀ}�b�`���Ă��邩�ǂ������肷�邱�Ƃ��o���܂��B

���̃T���v���ł�"[0-9a-zA-Z]+"�Ƃ����\���ŁA�u����(0-9)�������̓A���t�@
�x�b�g�̑啶��(A-Z)������(a-z)��1��ȏ�̌J��Ԃ�(+)�v�Ƃ����p�^�[���Ƃ�
�`�F�b�N���s���Ă܂��B

���K�\���̏ڂ���������API�h�L�������g�́Ajava.util.regex.Pattern�N���X��
����̂ŁA��x�ڂ�ʂ��Ă����Ă��������BString.matches���\�b�h�͂���
Pattern�N���X����y�ɗ��p���邽�߂̃��\�b�h�ɂȂ��Ă܂��B

�ŋ߂�1.4�ɂȂ��ď��߂āAJava�Ő��K�\�����W���T�|�[�g���ꂽ���߁A���̉�
���T�C�g�͈ӊO�Ə��Ȃ��ł��B���̓_�APerl�͓`���I�ɐ��K�\���ƂȂ��݂��[
���A���S�҂ɑ΂������T�C�g���������񂠂�܂��B����Perl�̐��K�\���Ƃ͈�
����������̂́A�����Ɛ��K�\����m�肽���Ƃ����l�́APerl�̓���T�C�g����
�߂Ċ��p����Ƃ����ł��傤�B
 */
