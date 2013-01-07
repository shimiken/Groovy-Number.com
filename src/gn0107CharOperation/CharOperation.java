/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "CharOperation"
 * CharOperation.java �uUnicode�������m���r�b�g���Z�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac CharOperation.java
 *     >java CharOperation
 * �y�L�[���[�h�z
 *     �r�b�g���Z(bit operation), �_����(and), ���j�R�[�h(Unicode), *     java.util.Formatter�N���X, 
 * �y�����Ă݂悤�z
 *     ��̊������R�}���h���C������󂯎��悤�ɂ���B *     OR���Z��XOR���Z�������Ă݂�B *     
 */
package gn0107CharOperation;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;

public class CharOperation {
    public static void main(String[] A00) {
        char L00 = '��';
        char L01 = '��';
        char L02 = (char)(L00 & L01);

        System.out.printf("�u%c�v�Ɓu%c�v�A����́u%c�v�ł���B%n", L00, L01, L02);
        System.out.println(L00 + ":" + Integer.toBinaryString(L00));
        System.out.println(L01 + ":" + Integer.toBinaryString(L01));
        System.out.println(L02 + ":" + Integer.toBinaryString(L02));
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���̐́A�A���t�@�x�b�g�̑啶���������ϊ��́A�r�b�g���Z����̒�ԃe�[�}��
�����B�������ŁA�r�b�g���Z�̎d�g�݂݂̂Ȃ炸�A�����𐔒l�Ƃ��ď��������
�����w�Ԃ��Ƃ��ł��܂����BASCII�R�[�h�\���Ȃ��߂āA�u�Ȃ�قǂȁv�Ɣ[��
�������̂ł��B

�Ƃ��낪�A�ŋ߂͂���ȃi�C�X�ȃe�[�}���Ȃ���ł���ˁBString�N���X�̃�
�\�b�h���Ăׂ΁A��{�I�ȏ����͂قƂ�ǉ\�Ȃ�ł�����B�ł��A�����ɑ΂�
�鉉�Z�́A�R���s���[�^�̖{���𗝉����邤���ł��d�v�ȗv�f�B�ĂȂ킯�ŁA
�w����Java256�{�m�b�N�x�ł́A�����ɕ����𐔒l�Ƃ��ď������邱�ƂɁA�^��
�Ɏ��g��ł܂��B

char�^���m��AND�������ʂɁA�킴�킴char�^���L���X�g�i�^�ϊ��j���Ă܂�
���A����́u���l���Z�̌��ʂ́Aint�^�܂���long�^�ɂȂ�v�Ƃ���Java�̌���
�d�l�̂��߂ł��B

���Ȃ݂ɁAJIS��ꐅ���Ɍ��肵�A�������m��AND���ĕʂ̊����ɂȂ�g�ݍ��킹
�𒲂ׂ��Ƃ���A30��8395�ʂ肠��܂����BOR�AXOR���܂߂�ƁA�����Ȑ��ɂ�
��܂��ˁB�����Ƒ��ɂ�Unicode�ɉB���ꂽ���b�Z�[�W�����݂���Ǝv���܂��B
���ɂȕ��͒T���Ă݂Ă��������B
 */
