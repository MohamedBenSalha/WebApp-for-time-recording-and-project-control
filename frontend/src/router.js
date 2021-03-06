import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
    routes: [
        {
            // ======================
            // Full Layout
            // ======================
            path: '',
            component: () => import('./layout/full/MainContainer.vue'),
            // ======================
            // Theme routes / pages
            // ======================

            children: [
                {
                    path: '/',
                    redirect: '/home'
                },

                {
                    path: '/home',
                    name: 'Home',
                    index: 1,
                    component: () => import('./views/StarterPage.vue')
                },
                {
                    path: '/searchResults/:searchKey',
                    name: 'Search Results',
                    index: 2,
                    component: () => import('./views/components/sopra/SearchResults'),
                    props: true
                },
                {
                    path:'/projectList',
                    name: 'Project list',
                    index: 3,
                    component: () => import('./views/components/sopra/projectList')
                },

                {
                    path: '/employeeList',
                    name: 'Employee list',
                    index: 4,
                    component: () => import('./views/components/sopra/employeeList')
                },
                {
                    path: '/clientList',
                    name: 'Client List',
                    index: 5,
                    component: () => import('./views/components/sopra/clientList.vue')
                },
                {
                    path: '/timeregistration',
                    name: 'Time Registration',
                    index: 6,
                    component: () => import('./views/components/sopra/timeRegistration')
                },
                {
                    path: '/CSV-Import',
                    name: 'CSV Import',
                    index: 6,
                    component: () => import('./views/components/sopra/CSV-Import')
                },

                {
                    path: '/CSV-Import-ticket-system',
                    name: 'CSV Import Ticket System',
                    index: 6,
                    component: () => import('./views/components/sopra/TicketSystem')
                },

                {
                    path: '/EventLog',
                    name: 'EventLog',
                    index: 7,
                    component: () => import('./views/components/sopra/EventLog')
                },


            ]
        },
        // Redirect to starterkit page, if no match found
        {
            path: '*',
            redirect: '/starterkit'
        }
    ]
})