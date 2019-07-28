package model;

public class Main {

    public static void main(String[] args) {

        Student st = new Student();
        st.setStno("001");
        st.setName("zhang");
        st.setSex("女");
        st.setAge(18);
        System.out.println("学号："+st.getStno()+"\n"+"姓名"+st.getName()+"\n"+"性别"+st.getSex()+"\n"+"年龄"+st.getAge());
    }
}
