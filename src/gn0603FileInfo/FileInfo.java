/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "FileInfo"
 * FileInfo.java �u�t�@�C���̗l�X�ȏ����擾�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac FileInfo.java
 *     >java FileInfo
 * �y�L�[���[�h�z
 *     ��΃p�X(absolute path), ���΃p�X(relative path),  *     URL(Uniform Resource Locator), java.util.Formatter�N���X, 
 * �y�����Ă݂悤�z
 *     �t�@�C�������݂��邩�ǂ����̃`�F�b�N������B *     �t�H���_�̏����擾���Ă݂�B
 */
import java.io.File;
import java.lang.String;
import java.lang.System;
import java.net.MalformedURLException;

public class FileInfo {
    static final String C00 = "data/sample.txt";

    public static void main(String[] A00) {
        File L00 = new File(C00);
        
        System.out.println("��΃p�X�@�@" + L00.getAbsolutePath());
        try {
            System.out.println("URL �@�@�@�@" + L00.toURL());
        } catch (MalformedURLException e) {
            System.out.println("URL�ɕϊ��ł��܂���ł����B");
        }
        System.out.println("�p�X���@�@�@" + L00.getPath());
        System.out.println("�t�@�C�����@" + L00.getName());
        System.out.printf("�X�V�����@�@%1$tD %1$tT%n", L00.lastModified());
        System.out.printf("�T�C�Y�@�@�@%d�o�C�g%n", L00.length());
        System.out.println("��΃p�X�H�@�@�@" + L00.isAbsolute());
        System.out.println("�f�B���N�g���H�@" + L00.isDirectory());
        System.out.println("�t�@�C���H�@�@�@" + L00.isFile());
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
����Ƀt�@�C�����w�肷��Ƃ����Ă��A�������̕��@������܂��B�u��΃p
�X�v�u���΃p�X�v�uURL�v�Ƃ����ł����A���ꂼ��̕ϊ��ɕ֗��Ȃ̂�File�N
���X�ł��B

����̃T���v���ł́A"data/sample.txt"�Ƃ������s���̃t�H���_����́u����
�p�X�v�Ńt�@�C�����w�肵�Ă��܂��B��������u��΃p�X�v�uURL�v���擾����
�܂��̂ŁA�\��������ׂĂ��̈Ⴂ�𗝉����Ă��������B

�܂��AFile�N���X�ł́A���̃t�@�C���Ɋւ�������擾���邱�Ƃ��o���܂��B
���̃T���v���ł͂��̒��̂�������\�����Ă܂����A���ɂ��擾�ł�����
����܂��̂Œ��ׂĂ݂Ă��������B
 */
