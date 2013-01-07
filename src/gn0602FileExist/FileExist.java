/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "FileExist"
 * FileExist.java �u�t�@�C���̑��݃`�F�b�N�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac FileExist.java
 *     >java FileExist
 * �y�L�[���[�h�z
 *     ���ۃp�X��(abstract pathname), �f�B���N�g��(directory), �t�@�C��(file)
 * �y�����Ă݂悤�z
 *     �f�B���N�g�������݂��邩�ǂ������ׂ�B *     �t�@�C�������݂����ꍇ�ɁA���̐�΃p�X��\������B
 */
import java.io.File;
import java.lang.String;
import java.lang.System;

public class FileExist {
    public static void main(String[] A00) {
        String[] L00 = {"FileExist.java", "Love256.java", "FileExist.class"};

        for (String L01 : L00) {
            File L02 = new File(L01);
            if (L02.exists() && L02.isFile()) {
                System.out.printf("�t�@�C���u%s�v�͑��݂��܂��B%n", L01);
            } else {
                System.out.printf("�t�@�C���u%s�v�͑��݂��܂���B%n", L01);
            }
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�t�@�C���̑��݃`�F�b�N�ɂ́A�I�[�v������Ƃ��ɁAFileNotFoundException��
�߂܂�����@�ƁA����File�N���X���g�����@������܂��B�t�@�C����ǂݏ�����
��̂Ȃ�A��O�őΉ����Ă������ł����A�P���ɑ��݂��`�F�b�N���邾���Ȃ�A
File�N���X�̕����ȒP�ł��ˁB

�t�@�C�����u���݂��Ȃ��v���Ƃ�z�肵�Ȃ���A�v���O������g�ނ̂���{�B
�Ƃ͂����A���́w����Java256�{�m�b�N�x�ł��A�u���݂���v���Ƃ�O��Ƃ���
�ӏ�������������܂��B����ȏꏊ����������A������ƑΏ�����悤�C��
���Ă��������B�蔲������Ȃ�������B�F����ւ̈��̎����Ƃ��āA�킴�Ǝc��
�Ă��ł�����ˁB�u��肱�ݕ������ځv�����b�g�[�Ȃ�ł�����B�}�W�ŁB
 */
