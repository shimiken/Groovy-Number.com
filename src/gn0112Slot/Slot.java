/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Slot"
 * Slot.java �u�����ŃX���b�g�}�V�[���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Slot.java
 *     >java Slot
 * �y�L�[���[�h�z
 *     �~���b(millisecond), �G�X�P�[�v�V�[�P���X(escape sequence:�g���\�L),  *     ����(random), �W������(standard input)
 * �y�����Ă݂悤�z
 *     ������̃p�^�[���𑝂₷�A������m���ɕω�������ȂǁA�����Ɩʔ�������B *     ���������Ƃ��ɁA�h��ȉ��o��������B
 */
package gn0112Slot;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.lang.Math;
import java.lang.String;
import java.lang.System;

public class Slot {
    public static void main(String[] A00) {
        int L00 = 100;

        BufferedReader L01 = new BufferedReader(
                new InputStreamReader(System.in));

        while (L00 > 0) {
            int L02 = 0;
            try {
                System.out.println("--------------------------");
                System.out.println("�������F" + L00);
                System.out.print("������q���܂����H�F");
                L02 = Integer.parseInt(L01.readLine());
                if (L00 < L02 || L02 <= 0) {
                    System.out.println("���q����A��k�͂�߂Ă���������B");
                    continue;
                }
                L00 -= L02;

            } catch (IOException L03) {
                System.out.println("���̓G���[�����������̂ŏI�����܂��B");
                System.exit(1);
            } catch (NumberFormatException L04) {
                System.out.println("��������͂��Ă��������B");
                continue;
            }

            System.out.print("�X���b�g�̐����F000");

            long L05 = System.currentTimeMillis() + 1000;

            int L06;

            do {
                L06 = (int)(Math.random() * 1000);
                System.out.printf("\b\b\b%03d", L06);
            } while (System.currentTimeMillis() < L05);

            System.out.println();

            if (L06 == 777) {
                L00 += (L02 * 1000);
                System.out.println("�哖����I");
            } else if (L06 % 111 == 0) {
                L00 += (L02 * 100);
                System.out.println("������I");
            }

        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�R�}���h���C���ŗV�ԃX���b�g�}�V�[���ł��B�|���������߂āAEnter�L�[����
���ƁA�X���b�g������Đ������o�܂��B777��1000�{�A7�ȊO�̃]���ڂ�100�{��
�����z���ɂȂ��Ă܂��B

main���\�b�h��{�ł�����������ŁA���[�J���ϐ��������A�ϐ�����͂��ĊO
��������B�܂��n�߂Ɂu�������v�Ɓu�|�����v�̕ϐ�����肷��Ƃ����ł���
���B

�X���b�g�̉�]�́A�o�b�N�X�y�[�X�őO�̐����������Ȃ���A�V����������\��
���邱�Ƃŕ\�����܂����B��]�̎��Ԃ�1�b�ԁB�V�X�e���̌��ݎ��Ԃ𗘗p����
�v�����Ă܂��B���̃V�X�e�����Ԃ̓G�|�b�N�^�C���ȂǂƌĂ΂�A1970�N1��1��
0��0��0�b����̌o�ߎ��Ԃ��A�~���b(1�b��1000�~���b)�ŕ\����܂��B

���Ȃ݂Ɏ�����1969�N���܂�B�R���s���[�^�I�ɂ́u�I���O���܂�v���Ċ�����
�̂��ȁB������ƃV���b�N�B
 */
