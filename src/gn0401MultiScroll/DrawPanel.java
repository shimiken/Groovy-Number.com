/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "MultiScroll"
 * DrawPanel.java �u����GIF�𗘗p���āA�w�i�𑽏d�X�N���[���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java MultiScroll
 * �y�L�[���[�h�z
 *     ����GIF(transparent gif), �W�F�l���b�N�X(generics), �g��for���[�v,  *     �R���N�V�����t���[�����[�N(Collections Framework),  *     
 * �y�����Ă݂悤�z
 *     MultiScroll.java�Q�ƁB
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

class DrawPanel extends JPanel implements ActionListener {
    List<Background> I00 = new ArrayList<Background>();

    public DrawPanel() {
        setPreferredSize(new Dimension(400, 300));

        I00.add(new Background("image/bg00.gif", 1));
        I00.add(new Background("image/bg01.gif", 2));
        I00.add(new Background("image/bg02.gif", 4));
        I00.add(new Background("image/bg03.gif", 0));
        I00.add(new Background("image/bg04.gif", 5));
    }

    public void actionPerformed(ActionEvent A00) {
        for (Background L00 : I00) {
            L00.M03();
        }

        repaint();
    }

    public void paintComponent(Graphics A00) {
        for (Background L00 : I00) {
            A00.drawImage(L00.M00(), L00.M02(), 0, this);
            A00.drawImage(L00.M00(), L00.M02() - L00.M01(), 0, this);
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���̃N���X�͉�ʕ\���Ɖ摜�̊Ǘ���S�����Ă��܂��B

�܂����ڂ��Ă��炢�����̂��R���X�g���N�^�[�B�w�i�I�u�W�F�N�g�𐶐����āA
List�ɒǉ����Ă܂��B�w�i�̐������Ɏw�肷��̂́A�摜�t�@�C�����ƃX�N���[
���̃X�s�[�h�B�������������A��O�𑬂����������ƂŁA���ߊ��̂��鑽�d�X
�N���[������������܂��B�܂��A���X�g�ɒǉ����鏇�Ԃ��d�v�ł��B���̒ǉ���
���`�揇�ɂ��Ȃ�̂ŁA���ɔz�u������̂��珇�Ԃɒǉ����Ă����܂��B

�����Ŏg�p����摜�ɂ́A�������̎d�|��������܂��B��A�_�A�n�ʁA�ԁA��
��5���̔w�i���p�ӂ��Ă����ł����A��ȊO��4����GIF�̓����F�̎w����g��
�āA���̉��ɂ���摜�������Č�����悤�ɂȂ��Ă܂��B�܂��A�E�̒[�����̒[
�ɂȂ��郋�[�v�\���ɂ��Ȃ��Ă܂��B��ʃT�C�Y��400x300�ŌŒ肵�Ă܂���
�ŁA�摜�͂��̃T�C�Y�ȏ�̕����K�v�B����͑S��400x300�ł��낦�Ă��܂��B

�\�����\�b�h�ł́A�܂��X�N���[���ʒu��1��`�悵�āA�摜�̕��Ԃ񍶂ɂ���
�����ʒu�ɂ���1��`�悵�Ă܂��B�������邱�ƂŁA�w�i�̃��[�v���������Ă�
�܂��B���E�����[�v�\���ɂȂ����摜��p�ӂ����̂͂��̂��߁B�悭�ώ@����
�ƁA�E�ŏ����čs���摜���A���̂܂܍��ɕ\������Ă���̂ɋC�Â��ł��傤�B
 */
