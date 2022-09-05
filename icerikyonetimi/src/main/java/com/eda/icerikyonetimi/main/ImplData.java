package com.eda.icerikyonetimi.main;

import com.eda.icerikyonetimi.entity.*;
import com.eda.icerikyonetimi.repository.UserRepository;
import com.eda.icerikyonetimi.service.*;

import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImplData {
    static ImplData implData = new ImplData();
    User user;
    static UserService userService;
    static LessonService lessonService;
    static SubjectDetailService subjectDetailService;
    static SubjectService subjectService;
    static QuestionsService questionsService;
    static AnswersService answersService;


    static Lesson lesson1;
    static Lesson lesson2;
    static Lesson lesson3;

    static Subject subject1;
    static Subject subject2;
    static Subject subject3;

    static SubjectDetail subjectDetail1;
    static SubjectDetail subjectDetail2;
    static SubjectDetail subjectDetail3;
    static Questions question1;
    static Questions question2;
    static Answers answers1;
    static Answers answers2;
    static User user1;
    static User user2;
    static User user3;
    static User user4;
    static User user5;
    static User user6;
    static List<Subject> subjects1List;
    static List<User> user1List;
    static List<User> user2List;
    static List<User> editor1List;
    static List<User> editor2List;

    static List<User> user3List;

    static List<Subject> subjects2List;

    public static void loadDatabase() {
        createUser();
        createLesson();
        createSubject();
        createSubjectDetail();
        createQuestions();
        createAnswers();
    }

    private static void createUser() {

        userService = new UserService();

        user1 = new User("Eda Senem", "Biyik", ERole.EDITOR, LocalDateTime.now(), LocalDateTime.now(), true);
        user2 = new User("Oguz", "Ada", ERole.EDITOR, LocalDateTime.now(), LocalDateTime.now(), true);
        user3 = new User("Ahmet", "Kara", ERole.EDITOR, LocalDateTime.now(), LocalDateTime.now(), true);
        user4 = new User("Semra", "Boy", ERole.USER, LocalDateTime.now(), LocalDateTime.now(), true);
        user5 = new User("Ayse", "Ak", ERole.USER, LocalDateTime.now(), LocalDateTime.now(), true);
        user6 = new User("Ece", "Eren", ERole.USER, LocalDateTime.now(), LocalDateTime.now(), true);
        user1List = new ArrayList<>();
        user2List = new ArrayList<>();
        editor1List=new ArrayList<>();
        editor2List=new ArrayList<>();
        user1List.add(user4);
        user1List.add(user5);
        user2List.add(user6);
        user2List.add(user5);
        editor1List.add(user1);
        editor1List.add(user2);
        editor2List.add(user2);
        editor2List.add(user3);


        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);


    }

    private static void createLesson() {
        lessonService = new LessonService();
        lesson1 = new Lesson("Java SE", "Java baslangic seviye dersleri", LocalDateTime.now(), LocalDateTime.now(), true);
        lesson3 = new Lesson("Java EE", "Java ileri seviye dersleri", LocalDateTime.now(), LocalDateTime.now(), true);
        lessonService.save(lesson1);
        lessonService.save(lesson3);


    }


    private static void createSubject() {
        subjectService = new SubjectService();

        subject1 = new Subject("Methodlar", lesson1, LocalDateTime.now(), LocalDateTime.now(), true);
        subject2 = new Subject("Döngüler", lesson1, LocalDateTime.now(), LocalDateTime.now(), true);
        subject3 = new Subject("OOP", lesson3, LocalDateTime.now(), LocalDateTime.now(), true);
        subjects1List = new ArrayList<>();
        subjects2List = new ArrayList<>();
        subjects1List.add(subject1);
        subjects1List.add(subject2);
        subjects2List.add(subject3);

        subject1.setLesson(lesson1);
        subject2.setLesson(lesson1);
        subject3.setLesson(lesson3);
        subject1.setSubjectDetail(subjectDetail1);
        subject2.setSubjectDetail(subjectDetail2);
        subject3.setSubjectDetail(subjectDetail3);


        subjectService.save(subject1);
        subjectService.save(subject2);
        subjectService.save(subject3);
    }

    private static void createSubjectDetail() {
        subjectDetailService = new SubjectDetailService();


        subjectDetail1 = new SubjectDetail(subject1, user1List, "Method",
                "Method konu anlatimi", "Metodlar java programlarının ana parçalarıdır. Metodlar sınıfların(class) içinde yer alan küçük " +
                "program parçacıklarıdır. Metodların çoğunda değişken parametreler metotlar ve sınıflar arasında iletişimi sağlarlar.", LocalDateTime.now(), LocalDateTime.now(), true)
        ;
        subjectDetail2 = new SubjectDetail(subject2, user1List, "Dongu",
                "Donguler konu anlatimi", " Döngü oluştururken belirleyeceğimiz koşul doğru olduğu sürece döngü içerisinde bulunan komut satırları" +
                " çalışmaya devam eder.", LocalDateTime.now(), LocalDateTime.now(), true);
        subjectDetail3 = new SubjectDetail(subject3, user2List, "OOP", "OOP konu anlatımı",
                "Java'da OOP kavramı veri ve metotları içeren, nesneler kavramına dayalı programlama yöntemi olarak ifade edebiliriz.", LocalDateTime.now(), LocalDateTime.now(), true)
        ;

        subjectDetail1.setSubject(subject1);
        subjectDetail2.setSubject(subject2);
        subjectDetail3.setSubject(subject3);
        subjectDetail1.setUser(user1List);
        subjectDetail2.setUser(user1List);
        subjectDetail3.setUser(user2List);
        subjectDetailService.save(subjectDetail2);
        subjectDetailService.save(subjectDetail1);
        subjectDetailService.save(subjectDetail2);


    }

    private static void createQuestions() {
        questionsService = new QuestionsService();
        question1 = new Questions(subjectDetail1, user1List, "Methodlar", "Methodlar parametresiz olur mU?", LocalDateTime.now(), LocalDateTime.now(), true);
        question2 = new Questions(subjectDetail1, user2List, "Döngüler", "break keyword ne ise yarar?", LocalDateTime.now(), LocalDateTime.now(), true);
        question1.setSubjectDetail(subjectDetail1);
        question1.setSubjectDetail(subjectDetail2);
        question1.setUser(user1List);
        question1.setUser(user2List);
        questionsService.save(question1);
        questionsService.save(question2);


    }


    private static void createAnswers() {
        answersService = new AnswersService();
        answers1 = new Answers(editor2List, "Olabilir", question1, LocalDateTime.now(), LocalDateTime.now(), true);
        answers2 = new Answers(editor1List, "Donguyu bitirir", question2, LocalDateTime.now(), LocalDateTime.now(), true);
        answers1.setQuestion(question1);
        answers2.setQuestion(question2);
        answers1.setUser(editor2List);
        answers2.setUser(editor1List);


        answersService.save(answers1);
        answersService.save(answers2);


    }

}
