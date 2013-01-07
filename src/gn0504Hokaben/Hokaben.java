/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Hokaben"
 * Hokaben.java �uMap���g���ăf�[�^�Ǘ��v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Hokaben.java
 *     >java Hokaben
 * �y�L�[���[�h�z
 *     �R���N�V�����t���[�����[�N(collections framework), *     �n�b�V���@(hashing), �f�[�^�����A���S���Y��,  *     �W�F�l���b�N�X(generics), �{�N�V���O(boxing), �A���{�N�V���O(unboxing),
 * �y�����Ă݂悤�z
 *     System.out.println(L00)�ŁA�}�b�v�̓��e��\�����Ă݂�B *     �R�}���h���C������ٓ������󂯎���āA���i���������ĕ\������B
 */
import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.System;
import java.util.Map;
import java.util.HashMap;

public class Hokaben {
    public static void main(String[] args) {
        Map<String, Integer> L00 = new HashMap<String, Integer>();
        
        L00.put("�̂�ٓ�", 290);
        L00.put("����g�ٓ�", 390);
        L00.put("�`�L����ؕٓ�", 460);
        L00.put("�f�~�n���o�[�O�ٓ�", 420);
        L00.put("�V���P�ٓ�", 380);
        L00.put("���[�X�J�c�ٓ�", 560);
        L00.put("���̓��ٓ�", 450);
        L00.put("�r�[�t�J���[", 390);
        L00.put("�e�q��", 390);
        L00.put("�r�b�O�`�L���J�c�ٓ�", 390);

        System.out.println("�`�@�ٓ��̋��z�������@�`");
        M00(L00, "���̓��ٓ�");
        M00(L00, "�`�L����ؕٓ�");
        M00(L00, "�t�H�A�O���ٓ�");
        M00(L00, "�r�b�O�`�L���J�c�ٓ�");
    }

    public static void M00(Map<String, Integer> A00, String A01) {
        try {
            int L00 = A00.get(A01);
            System.out.printf("�u%s�v%d�~%n", A01, L00);
        } catch (NullPointerException L01) {
            System.out.printf("�u%s�v�̓��j���[�ɂ������܂���B%n", A01);
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Map�́A����̗�ł����΁u�ٓ����v�Ɓu�l�i�v�̂悤�Ȋ����ŁA�u�L�[�v��
�u�l�v���y�A�ɂȂ������������Ƃ��Ɏg���܂��B�f�[�^�ʂ������Ă��A�L�[��
��������΁A�l��f�������o����̂������ł��B

Map<String, Integer>�Ƃ����錾�́A�L�[��String�^�A�l��Integer�^�����_��
��A�Ƃ����Ӗ��ŁA�Ⴄ��ނ̃f�[�^�����邱�Ƃ𖢑R�ɖh������������܂��B
���ۂɂ́Aput�Ńf�[�^��ǉ�����Ƃ����Aget�Œl�����o���Ƃ����A��{�^��
int���g���Ă܂����A�����int�^��Integer�^�������I�ɕϊ������Ƃ����@�\
���\�ɂ��Ă���L�q���@�ł��B

Map�͂����܂ł��C���^�[�t�F�[�X�ł��̂ŁAnew����ꍇ�́AHashMap�A
TreeMap�ALinkedHashMap�Ȃǂ̃N���X���g�����ƂɂȂ�܂��B���ꂼ���������
���ł����A����͈�ԍ����ɓ��삷��HashMap���̗p���܂����B�������ϐ���
Map�^�Ƃ��Đ錾���Ă܂��̂ŁA����Map�n�N���X���g���ꍇ���Anew�̂Ƃ��낳
�������������OK�B�ٓ����i�������\�b�h���C������K�v�͂���܂���B

���̂悤�ɁA�uMap�C���^�[�t�F�[�X�������������c�Ȃ�ł������v��Ԃŕϐ�
��錾���Ă����ƁA��X�A�\�[�X�R�[�h�̍ė��p�������܂�킯�ł��ˁB�I�u
�W�F�N�g�w���Ɋ���Ă��Ȃ��ƁA���܂ЂƂs���Ɨ��Ȃ���������܂��񂪁A�C
���^�[�t�F�[�X�o�R�ŃC���X�^���X����������̂��AJava�ł͈�̃X�^�C����
�Ȃ��Ă܂��̂ŁA�ǂ�ǂ�^�����Ă����ĉ������B
 */
