package org.example.java_core.Practice.Practice3.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VehicleList {

    ArrayList<Vehicles> vehiclesList;

    public VehicleList() {
        vehiclesList = new ArrayList<>();
    }

    public void addVehicle(Vehicles vehicle) {
        vehiclesList.add(vehicle);
    }

    // 1. Thêm xe
    public void addVehicleFromInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Thêm phương tiện giao thông mới ===");
        System.out.println("1. Ô tô");
        System.out.println("2. Xe máy");
        System.out.println("3. Xe tải");
        System.out.print("Chọn loại phương tiện (1-3): ");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice < 1 || choice > 3) {
            System.out.println("Loại phương tiện không hợp lệ.");
            return;
        }

        // Nhập thông tin chung
        System.out.print("Số xe (5 ký tự): ");
        String number = sc.nextLine().trim().toUpperCase();

        System.out.print("Hãng sản xuất (Honda/Yamaha/Toyota/Suzuki): ");
        String manufacturer = sc.nextLine().trim();

        System.out.print("Năm sản xuất: ");
        int year = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Màu xe: ");
        String color = sc.nextLine().trim();

        // thông tin chủ xe
        System.out.print("CMND (12 chữ số): ");
        String cmnd = sc.nextLine().trim();

        System.out.print("Họ tên: ");
        String fullName = sc.nextLine().trim();

        System.out.print("Email: ");
        String email = sc.nextLine().trim();

        try {
            VehicleOwners owner = new VehicleOwners(cmnd, fullName, email);
            Vehicles vehicle = null;

            switch (choice) {
                case 1:
                    System.out.print("Số chỗ ngồi xe hơi: ");
                    int seats = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Kiểu động cơ: ");
                    String engine = sc.nextLine().trim();
                    vehicle = new Cars(number, manufacturer, year, color, owner, seats, engine);
                    break;
                case 2:
                    System.out.print("Dung tích xi-lanh (cc): ");
                    float capacity = Float.parseFloat(sc.nextLine().trim());
                    vehicle = new Motorbikes(number, manufacturer, year, color, owner, capacity);
                    break;
                case 3:
                    System.out.print("Tải trọng (tấn): ");
                    float tonnage = Float.parseFloat(sc.nextLine().trim());
                    vehicle = new Trucks(number, manufacturer, year, color, owner, tonnage);
                    break;
                default:
                    System.out.println("Loại phương tiện không hợp lệ.");
                    return;
            }

            vehiclesList.add(vehicle);
            System.out.println("Thêm phương tiện thành công!");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi khi tạo chủ xe hoặc phương tiện: " + e.getMessage());
        }
    }

    public void addList(ArrayList<Vehicles> data) {
        if (data != null) {
            vehiclesList.addAll(data);
        }
    }

    public void addDemoList(ArrayList<Vehicles> data) {
        if (data != null) {
            vehiclesList.addAll(data);
        } else {
            vehiclesList.add(new Cars("A1234", "Toyota", 2021, "Đỏ",
                    new VehicleOwners("123456789012", "Nguyễn Văn A", "a@gmail.com"), 5, "Xăng"));

            vehiclesList.add(new Cars("B2345", "Honda", 2020, "Xanh",
                    new VehicleOwners("123456789012", "Nguyễn Văn A", "a@gmail.com"), 7, "Diesel"));

            vehiclesList.add(new Trucks("C3456", "Suzuki", 2022, "Trắng",
                    new VehicleOwners("123456789014", "Nguyễn Văn C", "c@gmail.com"), 3.5f));

            vehiclesList.add(new Trucks("D4567", "Yamaha", 2019, "Xám",
                    new VehicleOwners("123456789015", "Nguyễn Văn D", "d@gmail.com"), 4.0f));

            vehiclesList.add(new Motorbikes("E5678", "Honda", 2023, "Đen",
                    new VehicleOwners("123456789016", "Nguyễn Văn E", "e@gmail.com"), 150f));

            vehiclesList.add(new Motorbikes("F6789", "Yamaha", 2018, "Vàng",
                    new VehicleOwners("123456789017", "Nguyễn Văn F", "f@gmail.com"), 110f));

            vehiclesList.add(new Cars("G7890", "Toyota", 2022, "Bạc",
                    new VehicleOwners("123456789018", "Nguyễn Văn G", "g@gmail.com"), 4, "Hybrid"));

            vehiclesList.add(new Trucks("H8901", "Suzuki", 2021, "Cam",
                    new VehicleOwners("123456789019", "Nguyễn Văn H", "h@gmail.com"), 2.5f));

            vehiclesList.add(new Motorbikes("I9012", "Honda", 2020, "Xanh Lá",
                    new VehicleOwners("123456789020", "Nguyễn Văn I", "i@gmail.com"), 125f));

            vehiclesList.add(new Cars("J0123", "Yamaha", 2019, "Tím",
                    new VehicleOwners("123456789021", "Nguyễn Văn J", "j@gmail.com"), 6, "Xăng"));
        }
    }

    public void printVehiclesList() {
        for (Vehicles vehicles : vehiclesList) {
            System.out.println(vehicles);
        }
    }

    // 2. Tìm phương tiện theo số xe:
    public Vehicles findVehicleByNumber(String number) {
        for (Vehicles vehicle : vehiclesList) {
            if (vehicle.getNumber().equalsIgnoreCase(number)) {
                System.out.println("Tìm thấy xe!");
                return vehicle;
            }
        }
        System.out.println("Không tìm thấy xe..");
        return null;
    }

    //3. Tìm phương tiện của chủ xe theo số CMND
    public ArrayList<Vehicles> findVehicleByCMND(String CMND) {
        ArrayList<Vehicles> list = new ArrayList<>();
        boolean flag = false;
        for (Vehicles vehicle : vehiclesList) {
            if (vehicle.getCMND().equalsIgnoreCase(CMND)) {
                System.out.println("Tìm thấy xe!");
                list.add(vehicle);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy xe..");
        }
        return list;
    }

    //4. Xóa toàn bộ phương tiện của một hãng sản xuất bất kỳ
    // Dùng Iterator để xóa phần tử an toàn khi đang duyệt ArrayList
    public void removeVehicleByManuf(String manufacturer) {
        boolean flag = false;

        Iterator<Vehicles> iterator = vehiclesList.iterator();
        while (iterator.hasNext()) {
            Vehicles vehicle = iterator.next();

            String manuf = vehicle.getManufacturer();
            if (manuf != null && manuf.equalsIgnoreCase(manufacturer)) {
                iterator.remove();
                flag = true;
            }
        }

        if (flag) {
            System.out.println("Xóa thành công tất cả xe của hãng: " + manufacturer);
        } else {
            System.out.println("Không tìm thấy xe nào của hãng: " + manufacturer);
        }
    }

}
