/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Java256"
 * Java256.java �u�R�}���h�v�����v�g�ɕ������o�͂���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Java256.java
 *     >java Java256
 * �y�L�[���[�h�z
 *     �ׂ���(power), �^�ϊ�(cast), int(����)�^, java.util.Formatter�N���X, 
 * �y�����Ă݂悤�z
 *     Math.pow�̈�����ύX���āu32�{�̃m�b�N���󂯂�v��A *     �u65536�{�̃m�b�N���󂯂�v�ƕ\�����Ă݂�B
 */
package gn0101Java256;
import java.lang.Math;
import java.lang.String;
import java.lang.System;

public class Java256 {
    public static void main(String[] a00) {
        int L00 = (int)Math.pow(2, 8);
        System.out.println("�鐾�I�@��X�́A�X�|�[�c�}���V�b�v�ɂ̂��Ƃ�");
        System.out.printf("���X���X�A%d�{�̃m�b�N���󂯂邱�Ƃ𐾂��܂��B%n", L00);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
java.lang.Math.pow()�́Adouble�^��Ԃ��܂��B�ł��̂ŁA���̂܂܂���
"256.0"�ƂȂ��Ă��܂��̂ŁAint�^�ɕϊ����Ă܂��B

�R���s���[�^�̊�{��2�i��(binary)�ł��̂ŁA�Q�ׂ̂���͂悭�o�Ă��܂��B
8,16,32,64,128,256,512,1024,65536�������Ƃ��ɂ̓s���Ɨ���悤�ɂȂ��Ă�
�������B�Ƃ͂����A�������Ȃ񂩂ł��ނ肪256�~�������肵���Ƃ��ɁA�u����
���A�҂�����I�v�Ǝ������Ă��A��ʂ̐l�ɂ͗������Ă��炦�܂��񂩂�ˁB

128(�C�`�j�b�p)�A256(�j�S��)�Ɣ�������ƁA�v�����ۂ��Ă��������ł��B
 */
