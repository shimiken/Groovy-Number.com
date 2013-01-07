/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Category"
 * DataManager.java �uSet���g�����J�e�S���[���ށv
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java Category
 * �y�L�[���[�h�z
 *     �W�F�l���b�N�X(generics), �g��for���[�v, Set(�W��), List(���X�g),  *     equals�ɂ�镶����̔�r *     
 * �y�����Ă݂悤�z
 *     Category.java���Q�ƁB
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DataManager {
    static final String C00 = "comic_char.csv";
    List<ComicChar> I00 = new ArrayList<ComicChar>();

    public DataManager() {
        // CSV�t�@�C������f�[�^��ǂݍ���Ń��X�g�ɒǉ�
        try {
            BufferedReader L00 = new BufferedReader(new FileReader(C00));
            String L01;
            while( (L01 = L00.readLine()) != null ) {
                String[] L02 = L01.split(",");
                I00.add(new ComicChar(L02[0], L02[1]));
            }
            L00.close();
        } catch(FileNotFoundException L03) {
            System.out.println(C00 + "��������܂��ł����B");
        } catch(IOException L04) {
            System.out.println(C00 + "��ǂݍ��߂܂���ł����B");
        }
    }
    
    // �J�e�S���[�̔z���Ԃ�
    public String[] M00() {
        Set<String> L00 = new LinkedHashSet<String>();
        
        for (ComicChar L01 : I00) {
            L00.add(L01.I00);
        }

        return L00.toArray(new String[0]);
    }

    // �J�e�S���[���w�肵�Č���
    public List<ComicChar> M01(String A00) {
        List<ComicChar> L00 = new ArrayList<ComicChar>();

        for (ComicChar L01 : I00) {
            if (L01.I00.equals(A00)) {
                L00.add(L01);
            }
        }

        return L00;
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�f�[�^�̊Ǘ���S�����邱�̃N���X�ɂ�3�̋@�\��������Ă܂��B

�܂��́A�R���X�g���N�^�ŊO���t�@�C������f�[�^��ǂݍ��ދ@�\�B�ǂݍ��܂�
���f�[�^��1�����ƃC���X�^���X������āAList�ɒǉ�����܂��B�ȍ~�A����
List����A�����K�v�ȃf�[�^�����o�����ƂɂȂ�܂��B�R���X�g���N�^�Ȃ�
�ŁA�t�@�C���̓ǂݍ��݂͍ŏ��̂P�񂾂��ł��ˁB

���́A�J�e�S���[���W�v����@�\�B�ǂݍ���List����A�J�e�S���[�����o��
�Ă܂����A�|�C���g�́A�d�����Ȃ��K�v������Ƃ������ƁB�����ŃR���N�V����
�t���[�����[�N��Set�̓o��ł��BSet�́A���w�ł����Ƃ���́u�W���v�ŁA�d��
�v�f�������Ȃ��Ƃ�������������܂��B���������W�v�ɂ͂҂�����ł��ˁB

Set����z��ւ̕ϊ���toArray���\�b�h���g���Ă܂����A���̈�����String[0]
�ƁA����0�̔z���n���Ă܂��B���̃��\�b�h�́A�u�z��̃T�C�Y���\���łȂ�
�ꍇ�́A�������s���̌^�ŐV�����z�񂪊i�[�p�Ƃ��Ċ��蓖�Ă���v�����Ȃ�
�ŁA�z��̒�����0��OK�B�厖�Ȃ͔̂z��̌^�����ł��B

�Ō�ɁA�w�肳�ꂽ�J�e�S���[�̃f�[�^���������o���@�\�B����List����Y��
����f�[�^��I��ŁA�ʂ�List�ɒǉ����Ă��܂��B�u����V����List�𐶐���
�āA�������͑��v���H�v�Ƃ����C�����܂����AList�ɂ̓C���X�^���X�̎Q�Ƃ�
���邾���Ȃ̂ŁA����قǎ����͏���܂���B

�W�F�l���b�N�X�̂������Ŗʓ|�Ȍ^�ϊ����Ȃ��A�g��for���[�v�ł�������ƑS
�v�f�̑������ł��Ă܂��B���̂ւ�́AJ2SE 5.0���܂��܂ł��ˁB
 */
