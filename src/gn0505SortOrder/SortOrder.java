/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "SortOrder"
 * SortOrder.java �u�ǂ݉������ɖ��O���\�[�g�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac SortOrder.java
 *     >java SortOrder
 * �y�L�[���[�h�z
 *     �����C���i�N���X(anonymous inner class), ���בւ�(sort),  *     java.lang.Comparable�C���^�[�t�F�[�X *     
 * �y�����Ă݂悤�z
 *     50���̍~���i�t���j�ŕ��בւ���B *     Person�N���X�ɔN��Ȃǂ�ǉ����āA���̍��ڂŕ��בւ���B *     �R���p�C����A�ǂ��.class�t�@�C�����o�����̂��m�F����B
 */
import java.lang.String;
import java.lang.System;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortOrder {

    class Person {
        String I00;
        String I01;

        public Person(String A00, String A01) {
            this.I00 = A00;
            this.I01 = A01;
        }
    }

    public SortOrder() {
        List<Person> L00 = new ArrayList<Person>();

        L00.add(new Person("���򏃈�Y", "�������� ����񂢂��낤"));
        L00.add(new Person("�y�E�����W����", "�� ��񂶂��"));
        L00.add(new Person("�x�]�M��", "�ق肦 �����ӂ�"));
        L00.add(new Person("�� �厡", "���� �����͂�"));
        L00.add(new Person("�v���e�B����", "�Ȃ����� �Ղ�Ă�"));

        System.out.println("---- ���ёւ��O ----");
        for (Person L01 : L00) {
            System.out.printf("%s(%s)%n", L01.I00, L01.I01);
        }

        Collections.sort(L00, new Comparator<Person>() {
            public int compare(Person A00, Person A01) {
                return A00.I01.compareTo(A01.I01);
            }
        });

        System.out.println("\n---- �T�O���� ----");
        for (Person L02 : L00) {
            System.out.printf("%s(%s)%n", L02.I00, L02.I01);
        }
    }

    public static void main(String[] args) {
        new SortOrder();
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�����Ő݌v�����N���X�̃C���X�^���X����בւ���ɂ́A�O������Comparable�C
���^�[�t�F�[�X���������Ă������@�ƁA�\�[�g����Comparator���w�肷����@��
�Q������܂��B����Љ��̂͌�҂̕��B���̕��@�Ȃ�A�w�肷��
Comparator��ς��邱�ƂŁA�l�X�ȏ����ɕ��וς��邱�Ƃ��\�ł��B

���̃T���v���ɂ͂Q�̃C���i�[�N���X���o�ꂵ�܂��B�C���i�[�N���X�Ƃ̓N��
�X�̒��ɒ�`���ꂽ�N���X�̂��ƁB�P��Person�N���X�B����͕�����₷����
����ˁB�����P�́ACollections.sort���\�b�h�̈����̒��Ŗ����i�����j�C��
�i�[�N���X�Ƃ��Ē�`����Ă��܂��B

�����C���i�[�N���X���Ă̂́A�N���X��`�̏ȗ��`�ŁA�ق�̐��s�A����������
��Q�Ƃ���Ȃ��悤�Ȃ��̏����̃N���X�����ꍇ�ɁA�u�킴�킴���O����
�Ē�`����قǂł��ˁ[�ȁv���ĂƂ��Ɏg���܂��B�������A���܂蒷�������C��
�i�[�N���X������Ă��܂��ƁA�����̗��ꂪ�����ɂ����Ȃ��Ă��܂��܂��B����
�����ꍇ�ɂ́A�ʏ�̖��O���C���i�[�N���X�ŋL�q���ׂ��ł��ˁB

J2SE 5.0�̐V�@�\�u�W�F�l���b�N�X�v��List��Map�Ȃǂ̃R���N�V�����n���L��
�ł����AComparator�ɂ��g���܂��BObject�^���L���X�g���Ȃ��Ă����ł����A��
����ĈႤ�^��n���S�z���Ȃ��A���S�ł��ˁB
 */
