package th.ac.kku.cis.lab01layout.services

import th.ac.kku.cis.lab01layout.Person
import th.ac.kku.cis.lab01layout.R

class PersonServices {
    val persons: List<Person> = listOf<Person>(
        Person("ศรันย์ ซุ่นเส้ง","643450086-6", R.drawable.saran),
        Person("กมล จันบุตรดี","643450063-8", R.drawable.ake),
        Person("ประสิทธิชัย จันทร์สม", "43450079-3", R.drawable.far),
        Person("จักรพรรดิ์ อนุไพร","643450065-4", R.drawable.dew),
        Person("ชาญณรงค์ แต่งเมือง","643450069-6", R.drawable.jeb),
        Person("สุธาดา โสภาพ","643450089-0", R.drawable.neoy),
        Person("อมรรัตน์ มาระเหว","643450094-7", R.drawable.tey),
        Person("เทวารัณย์ ชัยกิจ","643450324-6", R.drawable.run),
        Person("เจษฎา ลีรัตน์","643450067-0", R.drawable.pat),
        Person("ณัฐกานต์ อินทรพานิชย์","643450072-7" , R.drawable.way),
        Person("ทัศนีย์ มลาตรี","643450075-1", R.drawable.tuk),
        Person("ธนาธิป เตชะ","643450076-9", R.drawable.jay),
        Person("ปรเมศวร์ สิทธิมงคล", "643450078-5", R.drawable.make),
        Person("พรธิตา ขานพล", "643450080-8", R.drawable.beam),
        Person("พีระเดช โพธิ์หล้า", "643450082-4", R.drawable.peach),
        Person("วิญญู พรมภิภักดิ์", "643450084-0", R.drawable.manu),
        Person("ศรสวรรค์ ไพรอนันต์", "643450085-8", R.drawable.bow),
        Person("อภิทุน ดวงจันทร์คล้อย", "643450092-1", R.drawable.pond),
        Person("อภิวัฒน์ ดาวโคกสูง", "643450093-9", R.drawable.kan),
        Person("อรัญ ศรีสวัสดิ์", "643450095-5", R.drawable.peaow),
        Person("กฤติยา สินโพธิ์", "643450320-4", R.drawable.guk),
        Person("ก้องภพ ตาดี", "643450321-2", R.drawable.model),
        Person("เกรียงศักดิ์ หมู่เมืองสอง", "643450322-0",R.drawable.singto),
        Person("เจษฏา พบสมัย", "643450323-8", R.drawable.bank),
        Person("ธนบดี สวัสดี", "643450325-4", R.drawable.timmy),
        Person("นภัสสร ดวงจันทร์", "643450326-2", R.drawable.cream),
        Person("นภาปิลันธ์ ชาวชายโขง", "643450327-0", R.drawable.nat),
        Person("นริศรา วงค์บุตรศรี", "643450328-8", R.drawable.may),
        Person("วรรณภา เบ้านาค", "643450330-1", R.drawable.nim),
        Person("ศุภชัย แสนประสิทธิ์", "643450332-7", R.drawable.beamb),
        Person("เสฏฐวุฒิ สาระกุล", "643450333-5" ,R.drawable.sat),
        Person("อฆพร ไร่ขาม", "643450334-3", R.drawable.polla),
        Person("ปฏิภัทร ดำทองสุก", "643450508-6", R.drawable.ink),
        Person("กฤตวัฒน์ อินทรสิทธิ์", "643450644-8", R.drawable.kf),
        Person("ณัฐธิดา บุญพา", "643450647-2", R.drawable.jan),
        Person("รัตพงษ์ ปานเจริญ", "643450650-3", R.drawable.teoy),
    )
    public fun GetAllPersonData(): List<Person>{
        return persons
    }
    public fun GetPersonDataByID(id:String) {
        //search data by id
        return //Homework
    }
}