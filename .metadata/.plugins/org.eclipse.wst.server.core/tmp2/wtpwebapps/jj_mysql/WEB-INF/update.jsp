<%@ page language="java" contentType="text/html;
 charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
    form{
        display: flex;
        flex-direction: column;
        width: 100px;

    }
    button{
    width:50px
    }
    
</style>
<body>
    <p>登録者の情報を入れてください</p>
    <form action="update" method="post">
        <label for="id">id</label>
        <input type="text" name="id" >
        <label for="name">名前</label>
        <input type="text" name="name" >
        <label for="sqlDate">入社日</label>
        <input type="date" name="sqlDate">
          <label for="sqlDate">フラグ</label>
        <input type="text" name="retire_flg">
        <label for="bu_id">所属コード</label>
        <input type="text" name="bu_id">
        <button type="submit">送信</button>
    </form>
    
</body>
</html>