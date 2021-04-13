public class Main {
    public static void main(String[] args) {
        ManagerStaff khanh = new ManagerStaff();
        Staff[] staff = new Staff[5];
        staff[0] = new StaffFullTime("NV1", "Name1", 20, 01234567, "abc@gmail.com", 100, 20, 500);
        staff[1] = new StaffFullTime("NV2", "Name2", 20, 0123456, "abcd@gmail.com", 50, 10, 500);
        staff[2] = new StaffFullTime("NV3", "Name3", 20, 012345, "abcde@gmail.com", 100, 50, 500);
        staff[3] = new StaffPartTime("NV4", "Name4", 20, 01234, "abcdeg@gmail.com", 80);
        staff[4] = new StaffPartTime("NV5", "Name5", 20, 0123, "abcdegh@gmail.com", 100);
        khanh.setStaffs(staff);
        System.out.println(khanh.getAVG());
        for (StaffFullTime s : khanh.getFullTimeLowerAVG()) {
            if(s!= null)
            System.out.println(s);
        }


    }
}
