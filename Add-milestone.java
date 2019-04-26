package com.groupx.servlet;

import com.groupx.model.Milestone;
import com.groupx.model.MilestoneList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;;
import java.io.IOException;
import java.util.Calendar;

@WebServlet(urlPatterns = "/com.groupx.milestone.do")
public class addMilestoneServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ms = milestone
        ArrayList <Milestone> msList = MilestoneList.listMilestones();

        String msTitle = request.getParameter("title");
        String msDescription = request.getParameter("description");
        String msDate = request.getParameter("date");

        request.setAttribute("msList", msList);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listMilestone.do");

        requestDispatcher.forward(request, response);
    }


}
