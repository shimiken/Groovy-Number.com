/*
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Animal"
 * Animal.java �u�R�}���h������switch�����g���āA�Ȃ񂿂���ē����肢�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Animal.java
 *     >java Animal
 * �y�L�[���[�h�z
 *     switch��, ��]���Z�q(%), ������(String)�𐮐�(int)�ɕϊ�, 
 *     �R�}���h���C������(arguments)�̎擾, ��O(exception)�̕ߑ�(catch)
 * �y�����Ă݂悤�z
 *     �����̎�ނ𑝂₷�B
 *     �������N�������ǂ����̃`�F�b�N������B
 */
package gn0111Animal;
import java.lang.Integer;
import java.lang.NumberFormatException;
import java.lang.String;
import java.lang.System;

public class Animal {
    public static void main(String[] A00) {
        final int L00 = 6;
        int L01 = 0;
        int L02 = 0;
        int L03 = 0;

        if (A00.length < 3) {
            System.out.println("�g�p�� >java Animal 1969 6 26");
            System.exit(1);
        }

        try {
            L01 = Integer.parseInt(A00[0]);
            L02 = Integer.parseInt(A00[1]);
            L03 = Integer.parseInt(A00[2]);
        } catch (NumberFormatException L04) {
            System.out.println("���N�����ɂ͐������w�肵�Ă��������B");
            System.exit(1);
        }

        int L05 = (L01 + L02 + L03) % L00;

        System.out.printf("%d�N%d��%d�����܂�̂��Ȃ���...%n", L01, L02, L03);

        switch (L05) {
            case 0:
                System.out.println("���₩�ȐS���������q�c�W�ł��B");
                break;
            case 1:
                System.out.println("�����Ƃ�}�C�y�[�X�̃R�A���ł��B");
                break;
            case 2:
                System.out.println("��������Ԃ̃��C�I���ł��B");
                break;
            case 3:
                System.out.println("�ǓƂ���D���ȃI�I�J�~�ł��B");
                break;
            case 4:
                System.out.println("�����q�҂̃T���ł��B");
                break;
            case 5:
            default:
                System.out.println("�s�v�c�Ȑ��i�̃^�X�}�j�A���f�r���ł��B");
                break;
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���͂��ꂽ���t�𖳗����v�Z����Ƃ����A�C���`�L�L���A���S���Y���ł����A
���ۂɂ���Ă݂�ƁA�u���A�������Ă邩���I�H�v�Ǝv�����肵���Ⴂ�܂��B��
���A�肢���Ă�����������Ȃ��̂Ȃ�ł��傤�ˁB

���������t���ǂ������ׂ�ɂ́A�`�F�b�N�������N�������g���āA���ۂ�
java.util.Calendar�C���X�^���X�𐶐���������������ł��傤�B�����G���W
����"java ���t �Ó���"�ŒT���ƁA�����T���v����������Ǝv���܂��B
 */
