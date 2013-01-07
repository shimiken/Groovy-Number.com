/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "ArraySort"
 * ArraySort.java �uArrays�Ŕz����\�[�g�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac ArraySort.java
 *     >java ArraySort
 * �y�L�[���[�h�z
 *     ���ёւ�(sort), ���R�����t��(natural ordering), ����(ascending order), *     Comparable(��r�\)�C���^�t�F�[�X, �z��(array)�̒���(length)
 * �y�����Ă݂悤�z
 *     String�^�ȊO�̔z����\�[�g���Ă݂�B *     java.util.Comparator�����������N���X�����A�~���ɕ��בւ���B
 */
import java.lang.String;
import java.lang.System;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] A00) {
        String[] L00 = { "�E�C���i�[", "�A���`���r", "�I�j�I��", "�C�J", "�G�r" };

        System.out.println("���ёւ��O");
        M00(L00);

        Arrays.sort(L00);

        System.out.println("���ёւ���");
        M00(L00);
    }

    public static void M00(String[] A00) {
        for (int L00 = 0; L00 < A00.length; L00++) {
            System.out.printf("%d�ԖځF%s%n", L00 + 1, A00[L00]);
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���������בւ����ꍇ�A�����R�[�h�̏���(��������)�ɕ��т܂��B���̏�����
����t���Ă���̂́AString�N���X���������Ă���java.lang.Comparable�C��
�^�[�t�F�[�X��compareTo���\�b�h�ł��B��xAPI�h�L�������g�Ŋm�F���Ă�����
���������B
���߂Č���N���X�⃁�\�b�h�ɏo�������A�Ƃ肠����API�h�L�������g�Œ���
��Ȃ����Ă����ƁA�����ł���B�ŏ��̓`���v���J���v����������܂��񂪁A
�������̃g���[�j���O�ƐS���āA�ʓ|��������Ȃ��悤���肢���܂��B

�����ɏo�Ă���for���[�v�́A�z���S���\�����邽�߂̊�{�p�^�[���BJ2SE5.0
����͊g��for���[�v���g���Ĕz���S�đ������邱�Ƃ��\�ɂȂ�܂������A
���Ԗڂ̗v�f����\�����邽�߂ɁA�����Ċ�{�p�^�[�����g���Ă܂��B

Arrays.sort()���\�b�h�́A�����ɂ���Ďg�p����A���S���Y�����Ⴄ�݂���
�ŁAint,double�Ȃǂ̊�{�^�z��̏ꍇ�̓N�C�b�N�\�[�g�AString��Integer��
�悤�ȎQ�ƌ^�z��̏ꍇ�̓}�[�W�\�[�g���g���邻���ł��B�����̂�����͒�
�ׂĂ݂Ă��������B

���Ȃ݂ɁA�F����̓s�U�̃g�b�s���O�͉����D���ł����H�@�l�����̒�����I��
�Ƃ���΁A�A���`���r���I�j�I�������肩�ȁc�c�Ȃ񂾂��s�U��H�ׂ����Ȃ���
�������B
 */
