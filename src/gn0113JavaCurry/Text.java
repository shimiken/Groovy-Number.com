/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "JavaCurry"
 * Text.java �u�J���[�̃p�b�P�[�W���I�u�W�F�N�g�w���ŕ\���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java JavaCurry
 * �y�L�[���[�h�z
 *     �_��(logical)�t�H���g�ƕ���(physical)�t�H���g
 * �y�����Ă݂悤�z
 *     JavaCurry.java�Q��
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.lang.String;

public class Text implements Parts {
    String I00;
    int I01;
    int I02;
    Color I03;
    int I04;

    Text(String A00, int A01, int A02, Color A03, int A04) {
        this.I00 = A00;
        this.I01 = A01;
        this.I02 = A02;
        this.I03 = A03;
        this.I04 = A04;
    }

    public void M00(Graphics A00) {
        A00.setColor(I03);
        A00.setFont(new Font("SansSerif", Font.BOLD, I04));
        A00.drawString(I00, I01, I02);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�������[�J���̘b�ɂȂ��Đ\����Ȃ���ł����A�V�_���ʂ�̃P���^�b�L�[�̏�
�ɁA�u�c�i�p�n�v�Ƃ����J���[�����񂪂���܂��B�����́u�h���C�J���[�v��
�i���Ȃ��Ƃ������ɂƂ��Ắj���Ȃ�h����ł����A�Ƃ��Ă����������ł��B�f
�W�n�������Z���喼�ɂ��������A�����`�ł悭�H�ׂ܂����ˁB

���̓X�ɁA�h���̎w��Łu�f�r�����b�h�v�Ƃ������ڂ�����܂��B�����ɂ��h��
���Ȗ��O�ŁA���ۂɂ������h���ł��B���ƁA�́A�e�s�F�ʂ�ɂ������u�^�[�W�v
�Ƃ����X�ɂ́u�_�J���[�v�Ƃ������j���[������܂����B���ʂقǐh�����
���傤�ˁB�ŁA��������͂Ȃ��Ȃ����X�ł����A�V�_�r���n���́u�T���\���v��
�́A�u�v���ɐh�v�Ƃ����h���w�肪����܂����B�������A�ǂ���H�ׂ����Ƃ�
����܂���B
 */
