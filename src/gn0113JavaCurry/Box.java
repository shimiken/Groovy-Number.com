/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "JavaCurry"
 * Box.java �u�J���[�̃p�b�P�[�W���I�u�W�F�N�g�w���ŕ\���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java JavaCurry
 * �y�L�[���[�h�z
 *     ��`(rectangle)�̕`��
 * �y�����Ă݂悤�z
 *     JavaCurry.java�Q��
 */
import java.awt.Color;
import java.awt.Graphics;

public class Box implements Parts {
    int I00;
    int I01;
    int I02;
    int I03;
    Color I04;

    Box(int A00, int A01, int A02, int A03, Color A04) {
        this.I00 = A00;
        this.I01 = A01;
        this.I02 = A02;
        this.I03 = A03;
        this.I04 = A04;
    }

    public void M00(Graphics A00) {
        A00.setColor(I04);
        A00.fillRect(I00, I01, I02, I03);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���Ȃ݂ɁA�l�͐h���̂͋��ȕ��ł��B�Ƃ������A���������������Ă��܂���
���B�u�R�R�C�`�v�̃J���[�ł����΁A�h�����ʂŌ��\�������B�ł��A�D���Ȃ�
�ŁA���傭���傭�H�ׂɍs���Ă܂��B�悭��������̂́u�`�L���J�c�J���[�v��
���ˁB
 */
