package com.rgf5.controller;

import com.rgf5.bean.Classes;
import com.rgf5.bean.Course;
import com.rgf5.bean.DataBank;
import com.rgf5.bean.Teacher;
import com.rgf5.service.DataBankService;
import com.rgf5.service.impl.DataBankServiceImpl;
import com.rgf5.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "FileUploadServlet",value = "/FileUploadServlet")
public class FileUploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        Map<String, Object> map = WebUtils.fileUpLoad(request);
        String error = (String) map.get("error");
        Course course = (Course) map.get("course");
        DataBank dataBank = (DataBank) map.get("dataBank");
        Classes classes = (Classes) map.get("classes");
        if ("true".equals(error)) {
            request.getRequestDispatcher(
                  "DataBankServlet?method=getFileByCourseAndClass&className="
                      + classes.getClassName()
                      + "&courseName="
                      + course.getCourseName()).forward(request, response);
                }
        DataBankService dataBankService = new DataBankServiceImpl();
        HttpSession session = request.getSession();
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        dataBank.setAuthorId(teacher.getId());
        dataBank.setAuthorName(teacher.getTeacherName());
        System.out.println(dataBank);
        dataBankService.add(dataBank);
        request.getRequestDispatcher("DataBankServlet?method=getFileByCourseAndClass&className="+classes.getClassName()+"&courseName="+course.getCourseName()).forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
