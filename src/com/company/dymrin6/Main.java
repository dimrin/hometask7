package com.company.dymrin6;

public class Main {

    /*
    1. Создайте тип данных Участник и несколько его реализаций: Человек, Кот, Робот.
    2. Классы из п.2 должны обладать поведением бегать и прыгать (методы просто выводят информацию о действии в консоль).
    3. Создайте тип данных Препятствие и несколько его реализаций: Беговая Дорожка и Стена.
    4. Классы из п.3 должны обладать поведением преодолеть препятствие (overcome).
    5. Наладить взаимодействие между Участником и Препятствием.
    Другими словами, участники при прохождении через препятствия должны выполнять соответствующие действия (бежать или прыгать).
    Например: Человек пробежал беговую дорожку.
    6. Создайте два массива: с участниками и препятствиями.
    7. Каждый элемент из массива с участниками должен пройти каждое препятствие из массива с препятствиями.
     */
    public static void main(String[] args) {
        Participant[] participants = getParticipants();
        Obstacle[] obstacles = getObstacle();
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                obstacles[j].overcome(participants[i]);

            }

        }

    }

    static Participant[] getParticipants() {
        return new Participant[]{
                new Cat(),
                new Human(),
                new Robot()
        };
    }

    static Obstacle[] getObstacle() {
        return new Obstacle[]{
                new JumpingWall(),
                new RunningRoad()
        };
    }
}
