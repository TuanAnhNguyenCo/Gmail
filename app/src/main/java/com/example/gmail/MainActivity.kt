package com.example.gmail

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<Mail_item>()
        repeat(30) {
            items.add(
                Mail_item(
                    "Sự kiện đã hủy: Weekly meeting (AIST + HUST) - Group 1 @ Hàng tuần từ 4PM đến 6PM vào thứ hai (ICT) (vip123tuan@gmail.com)",
                    "Chúng tôi bên XXX. Xin chào, Nguyễn Cơ Tuấn Anh\n" +
                            "Chúc mừng Quý khách đã thanh toán thành công hợp đồng bảo hiểm thiết bị điện tử.\n" +
                            "Quý khách có thể xem và tải Giấy chứng nhận bảo hiểm (bao gồm: quyền lợi bảo hiểm và hướng dẫn yêu cầu bồi thường) tại đây.\n" +
                            "Bảng tóm tắt thông tin Giấy chứng nhận bảo hiểm thiết bị điện tử như sau:",
                    "Google.com",
                    LocalTime.now(),
                    resources.getIdentifier("avatar", "drawable", packageName)
                )
            )
        }
        findViewById<ListView>(R.id.MailContent).adapter = GmailAdapter(items)


    }
}


