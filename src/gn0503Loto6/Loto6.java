/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Loto6"
 * Loto6.java �u�z����V���b�t������v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Loto6.java
 *     >java Loto6
 * �y�L�[���[�h�z
 *     �z��(array), ���בւ�(sort), ����(random)
 * �y�����Ă݂悤�z
 *     ���ʂ��A�ߋ��̓��I�ԍ��Ɣ�r����B(Loto6.csv���Q�Ƃ̂���) *     �~�j���g��A�i���o�[�Y�̗\�z�ɑΉ�����B *     �o�����������Ŏ��ۂɍw�����Ă݂�B
 */
import java.lang.Math;
import java.lang.String;
import java.lang.System;
import java.util.Arrays;

public class Loto6 {

    public static void main(String[] A00) {
        final int L00 = 43;
        final int L01 = 6;
        int[] L02 = new int[L00];

        for (int L03 = 0; L03 < L00; L03++) {
            L02[L03] = L03 + 1;
        }

        int[] L04 = M00(L02, L01);
        Arrays.sort(L04);

        System.out.printf("%d�̐�������%d�̐�����I�Ԃ�...%n", L00, L01);
        for (int L05 : L04) {
            System.out.printf("%02d ", L05);
        }
    }

    static int[] M00(int[] A00, int A01) {
        for (int L00 = 0; L00 < A00.length; L00++) {
            int L01 = (int)(Math.random() * A00.length);
            int L02 = A00[L01];
            A00[L01] = A00[L00];
            A00[L00] = L02;
        }

        int[] L03 = new int[A01];
        for (int L00 = 0; L00 < A01; L00++) {
            L03[L00] = A00[L00];
        }
        
        return L03;
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
43�̐�������6�̐����̑g�ݍ��킹��I�ԁu���g�U�v���e�[�}�ɍ���Ă݂�
�����B�z��̑�������Ă��镔�����A�ꌩ������Â炢��������܂���ˁB���t
�Ő�������΁A�u43�̐������V���b�t�����āA�擪��6��ʂ̔z��ɃR
�s�[�B��������������ɕ��ёւ��v�ƂȂ�܂��B���\�b�h�̈����Ɩ߂�l�ɒ���
���āA�f�[�^�̗����ǂ������Ă��������B

����t�H���_�ɂ���"Loto6.csv"�ɂ́A223��܂ł̓��I�ԍ��������Ă܂��B�ŐV
�̃f�[�^�́A�T�C�g�i�݂��ً�s�Ȃǁj��t���[�̃c�[���i���󂭂�News�Ȃǁj
�𗘗p���ē��肵�Ă��������B

���́A�l�Ԃ��āA����ׂɐ�����I������̂����Ȃ�ł���ˁB�l�l��
�́A�΂�΂�Ȑ�����I�����Ă��Ă��A���ꂪ�����A���\���l�ƏW�܂�΁A�ǂ�
���Ă��A�����I�A�Љ�I�ȌX�����o�Ă��܂����̂ł��B�������ϓ_���猾���΁A
�R���s���[�^�ɂ�郉���_���ȑI���́A���z�z����_���Ƃ��̎Q�l�ɂȂ邩����
��܂���ˁB
 */
