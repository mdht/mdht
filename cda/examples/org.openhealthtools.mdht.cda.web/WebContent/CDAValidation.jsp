<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head></head>
<body>
<table border="2" align="center" width="75%">
     <thead>
          <tr>
               <th align="center" style="font-size: 200%;">MDHT Clinical Document Architecture Validation Web Site</th>
          </tr>
     </thead>
     <tr>
          <td colspan="4" style="font-size: 150%;" align="center">National Institute of Standards and Technology CDA Validation Service</td>
     </tr>
     <tr>
          <td>
          <form action="NISTWS.jsp" enctype="multipart/form-data" method="post">
          <table align="center" border="4" width="80%">
               <thead>
                    <tr>
                         <th align="center" colspan=2" >NIST Validation - Table View</th>
                    </tr>
               </thead>
               <tr>
                    <td>CDA Document</td>
                    <td><input type="file" name="file1" /></td>
               </tr>
               <tr>
                    <td colspan="2" align="right"><input type="submit" value="Validate Using NIST"></td>
               </tr>
          </table>
          </form>
          </td>
     </tr>
     <tr>
          <td>
          <form action="NISTTreeView.jsp" enctype="multipart/form-data" method="post">
          <table  align="center" border="4" width="80%">
               <thead>
                    <tr>
                         <th align="center" colspan=2" >NIST Validation - Tree View</th>
                    </tr>
               </thead>
               <tr>
                    <td>CDA Document</td>
                    <td><input type="file" name="file1" /></td>
               </tr>
               <tr>
                    <td colspan="2" align="right"><input type="submit" value="Validate Using NIST"></td>
               </tr>
          </table>
          </form>
          </td>
     </tr>
     <tr>
     <td colspan="4" style="font-size: 150%;" align="center" >Open Health Tools MDHT CDA Validation Service</td>
     </tr>
     <tr>
          <td>
          <form action="MDHTWS.jsp" enctype="multipart/form-data" method="post">
          <table  align="center" border="4" width="80%">
               <thead>
                    <tr>
                         <th align="center" colspan=2" >NIST Validation - Table View</th>
                    </tr>
               </thead>
               <tr>
                    <td>CDA Document</td>
                    <td><input type="file" name="file1" /></td>
               </tr>
               <tr>
                    <td colspan="2" align="right"><input type="submit" value="Validate Using MDHT"></td>
               </tr>
          </table>
          </form>
          </td>
     </tr>
     <tr>
          <td>
          <form action="MDHTTreeView.jsp" enctype="multipart/form-data" method="post">
          <table  align="center" border="4" width="80%">
               <thead>
                    <tr>
                         <th align="center" colspan=2" >NIST Validation - Table View</th>
                    </tr>
               </thead>
               <tr>
                    <td>CDA Document</td>
                    <td><input type="file" name="file1" /></td>
               </tr>
               <tr>
                    <td colspan="2" align="right"><input type="submit" value="Validate Using MDHT"></td>
               </tr>
          </table>
          </form>
          </td>
     </tr>
</table>
</body>
</html>