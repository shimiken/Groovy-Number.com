/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Category"
 * ComicChar.java �uSet���g�����J�e�S���[���ށv
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java Category
 * �y�L�[���[�h�z
 *     �R���X�g���N�^(constructor)
 * �y�����Ă݂悤�z
 *     Category.java���Q�ƁB
 */
import java.lang.String;

public class ComicChar {
    String I00;    // �J�e�S���[��
    String I01;    // �L�����N�^�[��

    public ComicChar(String A00, String A01) {
        this.I00 = A00;
        this.I01 = A01;
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
����́A�P���Ƀf�[�^���Ǘ�����N���X�ł��Bcomic_char.csv�̌`�����A
  [�J�e�S���[��],[�L�����N�^�[��]
�̂悤�ɂȂ��Ă܂��̂ŁA���ꂼ��̃f�[�^���i�[����t�B�[���h��p�ӂ��Ă�
�܂��BCSV�t�@�C���̍s�����A���̃N���X�̃C���X�^���X����������܂��̂ŁA
CSV�t�@�C���̒��g���m�F���Ă����Ă��������B

����ɂ��Ă��w�k�l�̌��x�͔M�����I�@�M���Ď��ʂ��I
 */
