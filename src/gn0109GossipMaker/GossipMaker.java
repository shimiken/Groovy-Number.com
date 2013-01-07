/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "GossipMaker"
 * GossipMaker.java �u�z��������Ɏ�郁�\�b�h�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac GossipMaker.java
 *     >java GossipMaker
 * �y�L�[���[�h�z
 *     �z��(array)�̏�����(initialize), �z��̒���(length),  *     ����(random), �^�ϊ�(cast) *     
 * �y�����Ă݂悤�z
 *     �ʔ����l�^���o��܂ŁA���x�����s����B *     ���̃e�[�}�ŕ��͂�������������v���O���������B
 */
package gn0109GossipMaker;
import java.lang.Math;
import java.lang.String;
import java.lang.System;

public class GossipMaker {
    public static void main(String[] A00) {
        String[] L00 = {
            "�Ɛ�X�N�[�v", "�Ռ�����", "�ɔ���", "�܂Ƃ�",
            "�����J���[", "�ƊE���R", "�V����", "������b",
        };
        String[] L01 = {
            "���򑍗�", "�t�Z�C�����哝��", "�����̕���",
            "�x�b�J��", "�{�u�T�b�v", "�v���e�B����", 
            "���[�j���O���B", "���c���q", "�ߏ��̂��΂����",
        };
        String[] L02 = {
            "�o�������������", "�Z�N�n������", "����摜���o", "�s�ϑ���", 
            "�g��Ƃŋt�؂�", "�J�c���^�f", "12�D�O�U��������",
            "�����L�[�\��������",
        };

        System.out.printf("%s!!�@%s�@%s!?%n", M00(L00), M00(L01), M00(L02));
    }
    
    public static String M00(String[] A00) {
        int L00 = (int)(Math.random() * A00.length);
        return A00[L00];
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���w���̍��A�u���ǂ��ŒN�����������v�Q�[�����Ă��܂���ł����H�@�u��
�v�u�ǂ��Łv�u�N���v�u���������v�Ƃ����̂����ꂼ�ꎆ�ɏ����āA�K���ɂ�
�Ȃ����킹�āA���̈ӊO�����y���ނ��Ă�ł��B
���̃T���v���́A���̗V�т��q���g�ɍ쐬���܂����B�l���̂Ƃ���ɁA�g�߂Ȑl
�Ԃ�����ƌ��\�y���߂܂��ˁB

�v���O�����I�ɂ́A�z��������Ƃ��ă��\�b�h�ɓn���Ă���Ƃ���ɒ��ڂł��B
�܂��A�z��̒����疳��ׂ�1�̗v�f���擾���镔���ł́A�z��̒����𓮓I
(�v���O�������s��)�Ɏ擾���Ă���̂ŁA�f�[�^��ǉ����Ă��A�������W�b�N��
�ύX����K�v�͂���܂���B
 */
