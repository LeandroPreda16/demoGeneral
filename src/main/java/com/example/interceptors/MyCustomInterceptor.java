package com.example.interceptors;


import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.example.config.NeedLogin;

@Component
public class MyCustomInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, java.lang.Object handler){

        // if (handler instanceof HandlerMethod) {
        //     NeedLogin needLogin = ((HandlerMethod) handler).getMethodAnnotation(NeedLogin.class);
        //     if (null == needLogin) {
        //         needLogin = ((HandlerMethod) handler).getMethod().getDeclaringClass()
        //                 .getAnnotation(NeedLogin.class);
        //     }
        //     // Check login if you have login validation annotations
        //     if (null != needLogin) {
        //         WxUserInfoContext curUserContext = (WxUserInfoContext) request.getSession()
        //                 .getAttribute("curUserContext");
        //         //If session No, not logged in.
        //         if (null == curUserContext) {
        //             response.setCharacterEncoding("UTF-8");
        //             response.getWriter().write("Not logged in!");
        //             return false;
        //         }
        //     }

        // }
        return true;
    }
}