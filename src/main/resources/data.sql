-- 1件目のデータ登録
INSERT INTO todos (todo, detail, created_at, updated_at)
VALUES ('買い物', 'スーパーで食材を購入する', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
-- 2件目のデータ登録
INSERT INTO todos (todo, detail, created_at, updated_at)
VALUES ('図書館に行く', '本を借りる', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
-- 3件目のデータ登録
INSERT INTO todos (todo, detail, created_at, updated_at)
VALUES ('ジムに行く', '運動する', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- 認証テーブルへのダミーデータの追加
-- password：adminpass
INSERT INTO authentications (username, password, authority, displayname) VALUES
('admin', '$2a$10$YzXfDM2TFxFkv/YslLvfS.9rqC40RVuBwwJmN4f7SUwWxm4DC.QgG', 'ADMIN', '管理太郎');
-- password：
INSERT INTO authentications (username, password, authority, displayname) VALUES
('user', '$2a$10$Oe4veUOols2.qNGN3sv5PuEnytGC8hXKcas1FZ2WBSb8hDzDV5XO6', 'USER', '一般花子');
