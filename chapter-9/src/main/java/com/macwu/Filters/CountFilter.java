package com.macwu.Filters;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Tong on 2016/8/24.
 */
public class CountFilter implements javax.servlet.Filter {
    private int count;
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        chain.doFilter(req, resp);
        count++;

        HttpServletRequest request = (HttpServletRequest) req;
        ServletContext servletContext = request.getSession().getServletContext();
        servletContext.setAttribute("count", count);

        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
        String param = config.getInitParameter("count");
        this.count = Integer.valueOf(param);
    }

}
