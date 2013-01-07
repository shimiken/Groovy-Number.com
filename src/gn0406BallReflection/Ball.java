/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "BallReflection"
 * Ball.java �u�E�B���h�E�̓����𔽎˂���{�[���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java BallReflection
 * �y�L�[���[�h�z
 *     ����(random), �ȉ~(oval)�̕`��, �`��F�̎w��, ���ˊp�Ɣ��ˊp *     
 * �y�����Ă݂悤�z
 *     �F���w��ł���悤�ɂ���B *     �ړ��X�s�[�h���w��ł���悤�ɂ���B
 */
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class Ball {
    int I00;
    int I01;
    int I02;
    int I03;
    int I04;

    Ball(int A00) {
        this.I02 = A00;

        I00 = (int)(Math.random() * (DrawPanel.C00 - I02));
        I01 = (int)(Math.random() * (DrawPanel.C01 - I02));

        // �i�s�����̓����_��
        if (Math.random() > 0.5) {
            I03 = 1;
        } else {
            I03 = -1;
        }
        if (Math.random() > 0.5) {
            I04 = 1;
        } else {
            I04 = -1;
        }
    }

    void M00() {
        I00 += I03;
        I01 += I04;

        // �ǂɏՓ˂���Δ���
        if (I00 >= (DrawPanel.C00 - I02) || I00 <= 0) {
            I03 = -I03;
        }
        if (I01 >= (DrawPanel.C01 - I02) || I01 <= 0) {
            I04 = -I04;
        }
    }

    void M01(Graphics A00) {
        A00.setColor(Color.orange);
        A00.fillOval(I00, I01, I02, I02);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�܂��A��ԉ���fillOval���\�b�h�̈�������A�������̃C���X�^���X�ϐ�����
���肷��ƁA�S�̂̏����������Ă���̂ł͂Ǝv���܂��B�{�[���̍��W�͉~�̒�
�S�ł͂Ȃ��A�~�ɊO�ڂ���l�p�`�̍���p�ɂȂ��Ă܂����A�����fillOval��
�\�b�h�̈����̎w����@�Ƃ��킹������ł��B

���̃N���X�ɂ́A�C�x���g��E�B���h�E�V�X�e���̋L�q���Ȃ��A�P���Ƀ{�[����
���鏈���݂̂ɂȂ��Ă�̂��~�\�ł��ˁB
 */
