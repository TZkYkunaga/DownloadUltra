# DownloadUltraPlus

Ứng dụng hỗ trợ tải nhiều file cùng lúc qua kết nối bảo mật SSL/TLS giữa Client và Server.

## 1. Cài đặt & Chuẩn bị

- Yêu cầu Java 8+.
- Tạo keystore cho server (`serverkeystore.jks`) và truststore cho client (`keytruststore.jks`, password: `password`).
- **File `keytruststore.jks` của client nằm trong thư mục `src` của project client.**
- Đảm bảo thư mục `src/Server/Assets` tồn tại để chứa file chia sẻ.

## 2. Khởi động Server

1. Chạy `Server.java`.
2. Nhập port (mặc định 2222) và nhấn **Connect**.
3. Thêm file vào thư mục chia sẻ bằng nút **Add**.
4. Xóa file bằng nút **Remove**.
5. Xem danh sách client đang kết nối ở bảng bên phải.
6. Ngắt kết nối client bằng cách chọn client và nhấn **Disconnect Client**.

## 3. Khởi động Client

1. Chạy `Client.java`.
2. Vào menu **Edit > Key CA** để chọn truststore và nhập mật khẩu.
3. Vào **Edit > Saving Path** để chọn thư mục lưu file tải về.
4. Vào **Edit > Connection** để nhập IP và port server.
5. Nhấn **Connect** để lấy danh sách file từ server.
6. Chọn file muốn tải và nhấn **Download**.
7. Theo dõi tiến trình tải, có thể tạm dừng, tiếp tục hoặc hủy tải từng file.

## 4. Một số lưu ý

- Khi server thêm/xóa file, client sẽ tự động nhận thông báo và cập nhật danh sách file.
- Kết nối giữa client và server luôn được mã hóa bằng SSL/TLS.
- Có thể tải nhiều file cùng lúc, mỗi file là một tiến trình riêng biệt.

## 5. Sơ đồ hoạt động

Xem file `workchart.md` để biết chi tiết luồng hoạt động và sơ đồ PlantUML.

---

**Khởi tạo:** 20/5/2025  
**Tác giả:** Bùi Hoàng Long