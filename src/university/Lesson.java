package university;

import java.time.LocalTime;

public class Lesson {

    private LessonType lessonType;
    private String lessonTitle;
    private String room;
    private LocalTime time;

    public Lesson() {
    }

    public Lesson(LessonType lessonType, String lessonTitle, String room, LocalTime time) {
        this.lessonType = lessonType;
        this.lessonTitle = lessonTitle;
        this.room = room;
        this.time = time;
    }

    public LessonType getLessonType() {
        return lessonType;
    }

    public void setLessonType(LessonType lessonType) {
        this.lessonType = lessonType;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public void setLessonTitle(String lessonTitle) {
        this.lessonTitle = lessonTitle;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}