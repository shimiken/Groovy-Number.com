/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Alphabet"
 * Alphabet.java �ufor���[�v���g���ăA���t�@�x�b�g��\���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Alphabet.java
 *     >java Alphabet
 * �y�L�[���[�h�z
 *     char(����)�^, for���[�v, �C���N�������g(increment:����)���Z�q, Unicode *     
 * �y�����Ă݂悤�z
 *     �������⊿�����C���N�������g���Ă݂�B *     ���[�v�J�E���^�[��char�^�ɂ��A�\���p�̕ϐ��ƌ��p������A����Z�܂ŕ\������B
 */
package gn0103Alphabet;
import java.lang.String;
import java.lang.System;

public class Alphabet {
    public static void main(String[] A00) {
        char L00 = 'A';

        for (int L01 = 0; L01 <= ('Z' - 'A'); L01++) {
            System.out.print(L00++);
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���������̂܂܌v�Z���Ŏg�����Ƃ��ł��܂��BJava��Unicode���̗p���Ă܂���
�ŁA������0�`65535�܂ł�2�o�C�g�̃R�[�h�ŊǗ����Ă��܂��B�ł��̂ŁA����
�I�ɂ́A�����锼�p(1�o�C�g)�E�S�p(2�o�C�g)�̋�ʂ�����܂���B�A���t�@
�x�b�g�ȊO�̕������ǂ��������Ԃŕ���������ł�̂��A�C�ɂȂ��Ė���Ȃ���
�������́A�v���؂���0����65535�܂őS���̕�����\�����Ă݂�ƁA�X�b�L����
��ł��傤�B

���Ȃ݂ɁA'A'�͕����A"A"�͕�����Ȃ̂ŁA�L�`���Ƌ�ʂ��Ă��������ˁB
 */
