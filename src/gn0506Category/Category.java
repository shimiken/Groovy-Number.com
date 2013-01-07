/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Category"
 * Category.java �uSet���g�����J�e�S���[���ށv
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java Category
 * �y�L�[���[�h�z
 *     �N���X�݌v(class design), Model(����), View(�\��)
 * �y�����Ă݂悤�z
 *     CSV�Ƀf�[�^��ǉ����A�J�e�S���[��������̂��m�F����B *     �ҏW�������e��CSV�ɏ����o���u�ۑ��v�@�\������B *     
 */
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Category extends JFrame implements ActionListener {
    JComboBox I00;
    JTextArea I01;
    DataManager I02;
    
    public Category() {
        I02 = new DataManager();
        // �J�e�S���[�̃��X�g���擾���āA�R���{�{�b�N�X���쐬
        I00 = new JComboBox(I02.M00());
        I01 = new JTextArea();
        add(I00, BorderLayout.NORTH);
        add(I01, BorderLayout.CENTER);
        
        I00.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent A00) {
        String L00 = (String)I00.getSelectedItem();
        // �I�����ꂽ�J�e�S���[�Ɋ܂܂��f�[�^������
        List<ComicChar> L01 = I02.M01(L00);

        I01.setText("");
        
        for (ComicChar L02 : L01) {
            I01.append(L02.I01 + "\n");
        }
    }

    public static void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        Category L00 = new Category();
        L00.setTitle("�J�e�S���[���Ƃɕ���");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setSize(320, 240);
        L00.setVisible(true);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
CSV�t�@�C������f�[�^��ǂݍ��݁A�J�e�S���[���Ƃɕ��ނ��ĕ\������v���O
�����ł��B�܂��̓v���O�����𓮂����A�t����CSV�t�@�C���̒��g�ƌ���ׂĂ�
�������B

���̃T���v���́ACategory�ADataManager�AComicChar��3�̃N���X�ō\������
�Ă���A���ꂼ��Ŗ����𕪒S���Ă��܂��BCategory�N���X�́AGUI��C�x���g
�����Ȃǂ�S���BComicChar��1���̃f�[�^��\���N���X�ŁA����ComicChar�̃�
�X�g��DataManager�N���X���Ǘ�����\���ɂȂ��Ă܂��B

�N���X�݌v�ɂ����āA�u��ʕ\���v�Ɓu�f�[�^�Ǘ��v�𕪂���̂͊�{���̊�
�{�B�N���X�����ɔY�ޏꍇ�́A�܂�����������|����ɂ���΂������Ǝv����
���B
 */
