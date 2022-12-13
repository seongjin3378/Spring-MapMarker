package jsj.MapMarker;

import SQLite.SQLiteManager;

import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        SQLiteManager manager = new SQLiteManager();

        manager.createConnection();     // 연결시도중
        manager.closeConnection();      // 연결 해제
        manager.ensureConnection();     // 재연결
    }
}
