package org.example.java_core.oop.final_keyword;

public class Test_FinalKeyword {

    // Vì CoreSystem_DemoFinalClass là final nên không thể kế thừa (sẽ báo lỗi)
//    public class SubCoreSystem extends CoreSystem_DemoFinalClass {
//    }

    public class SubMayTinh extends MayTinh_DemoFinalMethod {

        @Override
        public int tinhTich(int a, int b) {
            System.out.println("SubMayTinh");
            return super.tinhTich(a, b);
        }

        //Vì tinhTongFinal là final method nên không thể kế thừa
//        @Override
//        public int tinhTongFinal(int a, int b) {
//            System.out.println("SubMayTinh");
//            return super.tinhTich(a, b);
//        }
    }

}
